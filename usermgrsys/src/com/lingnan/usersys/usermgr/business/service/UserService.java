package com.lingnan.usersys.usermgr.business.service;

import com.lingnan.usersys.usermgr.domain.UserVo;

/**
 * UserService接口
 * @author Sna
 *
 */
public interface UserService{
	/**
	 * 用户登陆
	 * @param name 用户名
	 * @param password 密码
	 * @return 用户信息
	 */
	public UserVo login(String name,String password);

}
