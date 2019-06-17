package com.xdy.Test;

import org.junit.Test;

import com.xdy.util.StringUtil;

public class StringTest {
	
	@Test
	public void hasLengthTest(){
		boolean name=StringUtil.hasLength("11");
		System.out.println(name);
	}
	@Test
	public void hasLengthTest1(){
		boolean name=StringUtil.hasText("11");
		System.out.println(name);
	}
	
	@Test
	public void randomCharacterTest(){
		String char1=StringUtil.randomChineseString(3);
		System.out.println(char1);
	}
	
	@Test
	public void generateChineseNameTest(){
		String char1=StringUtil.generateChineseName(3);
		System.out.println(char1);
	}
}
