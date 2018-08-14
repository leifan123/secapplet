package com.sec.pojo;

import java.util.Date;

import java.io.Serializable;

public class SecUser  implements Serializable{

	private static final long serialVersionUID = 1534216327060340964L;
	private Integer id;

	public SecUser setId(Integer id){
		 this.id = id;
		 return this;
	}

	public Integer getId(){
		 return id;
	}
	private String code;

	public SecUser setCode(String code){
		 this.code = code;
		 return this;
	}

	public String getCode(){
		 return code;
	}
	private String username;

	public SecUser setUsername(String username){
		 this.username = username;
		 return this;
	}

	public String getUsername(){
		 return username;
	}
	private Integer phonenumber;

	public SecUser setPhonenumber(Integer phonenumber){
		 this.phonenumber = phonenumber;
		 return this;
	}

	public Integer getPhonenumber(){
		 return phonenumber;
	}
	private String password;

	public SecUser setPassword(String password){
		 this.password = password;
		 return this;
	}

	public String getPassword(){
		 return password;
	}
	private String userphotos;

	public SecUser setUserphotos(String userphotos){
		 this.userphotos = userphotos;
		 return this;
	}

	public String getUserphotos(){
		 return userphotos;
	}
	private Date birthday;

	public SecUser setBirthday(Date birthday){
		 this.birthday = birthday;
		 return this;
	}

	public Date getBirthday(){
		 return birthday;
	}
	private String graduateshool;

	public SecUser setGraduateshool(String graduateshool){
		 this.graduateshool = graduateshool;
		 return this;
	}

	public String getGraduateshool(){
		 return graduateshool;
	}
	private String workplace;

	public SecUser setWorkplace(String workplace){
		 this.workplace = workplace;
		 return this;
	}

	public String getWorkplace(){
		 return workplace;
	}
	private Integer identitycard;

	public SecUser setIdentitycard(Integer identitycard){
		 this.identitycard = identitycard;
		 return this;
	}

	public Integer getIdentitycard(){
		 return identitycard;
	}
	private Integer type;

	public SecUser setType(Integer type){
		 this.type = type;
		 return this;
	}

	public Integer getType(){
		 return type;
	}
	private Integer status;

	public SecUser setStatus(Integer status){
		 this.status = status;
		 return this;
	}

	public Integer getStatus(){
		 return status;
	}
	private Date createtime;

	public SecUser setCreatetime(Date createtime){
		 this.createtime = createtime;
		 return this;
	}

	public Date getCreatetime(){
		 return createtime;
	}
	private String remark;

	public SecUser setRemark(String remark){
		 this.remark = remark;
		 return this;
	}

	public String getRemark(){
		 return remark;
	}
}