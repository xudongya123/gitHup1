package com.xdy.Test;

import java.util.HashSet;

import org.junit.Test;

import com.xdy.util.RandomUtil;

public class RandomTest {
	
	@Test
	public void getRandomNumTest(){
		long randomNum=RandomUtil.getRandomNum(10, 30);
		System.out.println(randomNum);
	}
	
	@Test
	public void getRandomSetTest(){
		HashSet<Long> randomSet=RandomUtil.getRandomSet(1,10,3);
		for (Long long1 : randomSet) {
			System.out.println(long1);
		}
	}
	@Test
	public void randomCharacterTest(){
		char char1=RandomUtil.randomCharacter();
		System.out.println(char1);
	}
	@Test
	public void randomStringTest(){
		String str=RandomUtil.randomString(5);
		System.out.println(str);
	}
}
