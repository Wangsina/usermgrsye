package com.lingnan.usersys.usermgr.business.service;

import java.sql.Connection;

import com.lingnan.usersys.common.constant.EnumType;
import com.lingnan.usersys.common.dao.DaoFactory;
import com.lingnan.usersys.common.exception.DaoException;
import com.lingnan.usersys.common.exception.ServiceException;
import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgr.business.dao.UserDao;
import com.lingnan.usersys.usermgr.domain.UserVo;

/**
 * 用户service接口的实现类
 * @author Sna
 *
 */
public class UserServiceImpl implements UserService{
	/**
	 * 用户service类实例，在类的内部创建唯一的实例
	 */
	private static UserService userService=new UserServiceImpl();
	
	/**
	 * 构造方法私有化，private
	 */
	private UserServiceImpl(){
		
	}
    
	/**
	 * 取得用户service实例
	 * @return 实例对象
	 */
	public static UserService getInstance(){
		return userService;
	}
	
	/**
	 * 用户登录
	 * @param name 用户名
	 * @param password 密码
	 */
	public UserVo login(String name,String password){
		//声明数据库连接对象，用于保存数据库连接对象
		Connection conn=null;
		UserVo user=null;
		try{
			//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋给数据库连接对象变量
			conn=DBUtils.getConnection();
			//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现类，并赋值给dao接口变量
			UserDao userMgrDao=(UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
			user=userMgrDao.login(name, password);	
		}catch(DaoException e){
			//将自定义异常抛出
			throw e;
		}catch(Exception e){
			//将异常封装成自定义异常并抛出
			throw new ServiceException("用户登录错误",e);
		}finally{
			DBUtils.closeConnection(conn);
		}
		//返回用户登录结果
		return user;
	}
	
	
}
