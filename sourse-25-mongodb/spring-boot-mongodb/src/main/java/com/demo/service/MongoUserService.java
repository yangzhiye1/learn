package com.demo.service;

import java.util.List;

import com.demo.model.Users;
import com.demo.model.mongo.MongoUser;

/**
 * mongodb 案例
 * 创建者  小柒
 * 创建时间	2017年7月19日
 *
 */
public interface MongoUserService {
	public void saveUser(MongoUser users);

	public MongoUser findUserByName(String name);

	public void removeUser(String name);

	public void updateUser(String name, String key, String value);

	public List<MongoUser> listUser();

	public void allToMongo();
}