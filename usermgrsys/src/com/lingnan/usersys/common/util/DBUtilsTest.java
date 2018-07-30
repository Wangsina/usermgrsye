package com.lingnan.usersys.common.util;

import java.sql.Connection;

import org.junit.Test;

public class DBUtilsTest {

	@Test//注解
	public void testGetConnection() {
	    Connection conn =DBUtils.getConnection();
	    System.out.println(conn);
	}

}
