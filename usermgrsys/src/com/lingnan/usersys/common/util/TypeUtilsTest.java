package com.lingnan.usersys.common.util;

import static org.junit.Assert.*;

import java.awt.Checkbox;
import java.util.Date;

import org.junit.Test;

public class TypeUtilsTest {

	@Test
	public void testStrToDate() {
		Date d = null;
		String str="2016-2-12";
		d=TypeUtils.strToDate(str);
		System.out.println(d);
	}

	@Test
	public void testDateToStr() {
		Date d =new Date();
		String str = TypeUtils.dateToStr(d);
		System.out.println(str);
	}

	@Test
	public void testCheckEmail() {
		boolean b = TypeUtils.checkEmail("www.912246132@qq.com");
		System.out.println(b);
	}

}
