package com.sec.service;

import com.sec.pojo.SecUser;

import java.util.List;

public interface SecUserService {

	public void insert(SecUser secuser);

	public List<SecUser> select(SecUser secuser);

	public void update(SecUser secuser);

	public void delete(SecUser secuser);

	public List<SecUser> selectByParam(String field,String param);

	public void updateByParam(String param);

	public void deleteByParam(String param);

}

