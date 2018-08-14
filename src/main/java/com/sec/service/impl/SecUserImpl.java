package com.sec.service.impl;

import com.sec.pojo.SecUser;
import com.sec.dao.SecUserDao;
import com.sec.service.SecUserService;
import com.sec.util.NormName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecUserImpl implements SecUserService {

	private SecUserDao secUserDao;

	public void setSecUserDao(SecUserDao secUserDao){
		 this.secUserDao = secUserDao;
	}

	public void insert(SecUser secuser){
		secUserDao.insert(secuser);
	}

	public List<SecUser> select(SecUser secuser){
		return secUserDao.select(secuser);
	}

	public void update(SecUser secuser){
		secUserDao.update(secuser);
	}

	public void delete(SecUser secuser){
		secUserDao.delete(secuser);
	}

	public List<SecUser> selectByParam(String field,String param){
		Map<String, String> map = new HashMap<String, String>();
		map.put("field", field);
		map.put("param", NormName.normSql(param));
		 return secUserDao.selectByParam(map);
	}

	public void updateByParam(String param){
		Map<String, String> map = new HashMap<String, String>();
		map.put("param", NormName.normSql(param));
		  secUserDao.updateByParam(map);
	}

	public void deleteByParam(String param){
		Map<String, String> map = new HashMap<String, String>();
		map.put("param", NormName.normSql(param));
		  secUserDao.deleteByParam(map);
	}

}

