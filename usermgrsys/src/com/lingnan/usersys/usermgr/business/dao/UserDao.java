package com.lingnan.usersys.usermgr.business.dao;

import java.util.Base64;

import com.lingnan.usersys.common.dao.BaseDao;
import com.lingnan.usersys.usermgr.domain.UserVo;

/**
 * 用户dao接口
 * @author Sna
 *
 */
public interface UserDao extends BaseDao{
//	/**
//	 * 注册用户/添加用户
//	 * @param user 用户信息
//	 * @return 成功返回true，失败返回false
//	 */
//	public boolean addUser(UserVo user);
	
	/**
	 * 用户登陆
	 * @param user 用户信息
	 * @return 用户信息
	 */
	public UserVo login(String name,String password);
	
//	/**
//	 * 查找最大id 值
//	 * @return 最大的id值
//	 */
//	public int findMaxId();

}
