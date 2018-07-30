package com.lingnan.usersys.usermgr.business.dao;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgr.domain.UserVo;

public class UserDaoImplTest {

	@Test
	public void testUserDaoImpl() {
		UserDaoImpl aa=new UserDaoImpl(DBUtils.getConnection());
	}

	@Test
	public void testLogin() {
		Connection conn=DBUtils.getConnection();
		UserDaoImpl aa=new UserDaoImpl(conn);
		UserVo cc=new UserVo();
		cc=aa.login("王小娜","aaa");
		System.out.println(cc.getEmail());
	}

}
