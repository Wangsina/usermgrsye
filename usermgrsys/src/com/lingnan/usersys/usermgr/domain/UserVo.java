package com.lingnan.usersys.usermgr.domain;

import java.util.Date;

/**
 * 用户信息类
 * @author Sna
 *
 */
public class UserVo {
     private int id;          //主键
     private String userId;   //用户编号
     private String name;     //用户名
     private String pass;     //密码
     private String power;    //权限
     private String email;    //邮箱
     private Date birthday;   //出生日期
     private String status;   //状态位
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获得用户编号
	 * @return 编号
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置用户编号为指定参数的值
	 * @param userId 用户编号
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
     
}
