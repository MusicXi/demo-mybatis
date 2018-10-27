--
--    Copyright 2015-2016 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

drop table if exists city;
drop table if exists hotel;

create table city (id int primary key auto_increment, name varchar, state varchar, country varchar);
create table hotel (city int, name varchar, address varchar, zip varchar);

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into hotel(city, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` varchar(32) NOT NULL COMMENT '用户ID',
  `organization_id` varchar(32) DEFAULT NULL COMMENT '机构ID',
  `username` varchar(32) DEFAULT NULL COMMENT '用户名',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `phone` varchar(100) DEFAULT NULL COMMENT '手机',
  `email` varchar(100) DEFAULT NULL COMMENT '邮件',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人ID',
  PRIMARY KEY (`user_id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1001', '33ac8a93b1ad41c6abba93284073c59f', 'ims', 'ims', 'f1eaef26e3617e09c2364d4cdaa390ae', '0', '123456dd', 'ims@163.com', '2016-03-04 10:18:56', null);
INSERT INTO `sys_user` VALUES ('10e29164211446f0864a2f904ce70d32', 'a86604e0f89b4d83bd084349eae51967', 'houzi', '齐天大圣', 'fceafe5db1fd2511ee63049563be0d93', '1', '1ffff', 'dasheng@163.com', '2016-03-04 10:25:53', null);
INSERT INTO `sys_user` VALUES ('d4bbb31c44b24c4790b8a3c08ac22fce', '33ac8a93b1ad41c6abba93284073c59f', 'Name2', 'Jack', null, '', 'ddd', 'dd@qq.com', '2017-04-06 16:21:01', null);
INSERT INTO `sys_user` VALUES ('d8dafb1e65c1432086b1b1a2a0ab278d', null, 'Name1', 'Tom', null, null, null, null, '2017-04-06 16:21:01', null);
