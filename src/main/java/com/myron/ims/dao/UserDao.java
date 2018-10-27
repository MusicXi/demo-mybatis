package com.myron.ims.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


import com.myron.ims.bean.User;



@Mapper
public interface UserDao{
	/**
	 * 根据用户名和密码查询用户
	 * @param name
	 * @param password
	 * @return
	 */
	public List<User> findByLogin(String name, String password);
	
	/**
	 * 根据账号查询用户信息
	 * @param username
	 * @return
	 */
	public User findByUsername(String username);
	
	
	public List<User> findAllTest(User user);
	
	/**
	 * 同名用户数
	 * @param user
	 * @return
	 */
	public int countByName(User user);
	
	/**
	 * map封装分页信息和查询参数
	 * @param map
	 * @return
	 */
	public List<User> findAllByPage(Map<String, Object> map);
	
	//public int createSelective(User user);
	
	int insertByBatch(List<User> list);
	
}
