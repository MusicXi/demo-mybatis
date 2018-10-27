/**
 *    Copyright 2015-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package sample.mybatis;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sample.mybatis.dao.CityDao;
import sample.mybatis.domain.User;
import sample.mybatis.mapper.HotelMapper;
import sample.mybatis.mapper.UserDao;

@SpringBootApplication
public class SampleXmlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SampleXmlApplication.class, args);
	}

	private final CityDao cityDao;

	private final HotelMapper hotelMapper;

	private final UserDao userDao;

	public SampleXmlApplication(CityDao cityDao, HotelMapper hotelMapper, UserDao userDao) {
		this.cityDao = cityDao;
		this.hotelMapper = hotelMapper;
		this.userDao = userDao;
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.cityDao.selectCityById(1));
		System.out.println(this.hotelMapper.selectByCityId(1));
		User user = new User();
		user.setName("ims");
		//System.out.println(this.userDao.countByName(user));
		int pageNum = 2;
		int pageSize = 2;
		Page page= PageHelper.offsetPage(pageNum, pageSize);
		System.out.println(this.userDao.findAll(user));
		// TODO 分页版本抽离
	}

}
