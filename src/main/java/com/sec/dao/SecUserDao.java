package com.sec.dao;

import com.sec.pojo.SecUser;

import java.util.List;

import java.util.Map;

public interface SecUserDao {

	public void insert(SecUser secuser);

	public List<SecUser> select(SecUser secuser);

	public void update(SecUser secuser);

	public void delete(SecUser secuser);

	public List<SecUser> selectByParam(Map<String, String> param);

	public void updateByParam(Map<String, String> params);

	public void deleteByParam(Map<String, String> params);

}

