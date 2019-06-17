package com.xdy.util;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static long getRandomNum(long min,long max){
		long s=(long)(Math.random()*(max-min))+min;
		if((s==min)||(s==max)){
			return RandomUtil.getRandomNum(min, max);
		}
		return s;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static HashSet<Long> getRandomSet(long min,long max,int n){
		HashSet<Long> hashSet = new HashSet<Long>();
		long s;
		while(hashSet.size()<n){
			s=(long)(Math.random()*(max-min))+min;
			return RandomUtil.getRandomSet(min, max, n);
		}
		return hashSet;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter(){
		String string="123456789zxcvbnmasdfghjklqwertyuiop";
		char[] charArray=string.toCharArray();
		Random random = new Random();
		int abs=Math.abs(random.nextInt(charArray.length));
		return charArray[abs];
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int n){
		String string="123456789zxcvbnmasdfghjklqwertyuiop";
		char[] charArray=string.toCharArray();
		Random random = new Random();
		String str="";
		for (int i = 0; i < n; i++) {
			int abs=Math.abs(random.nextInt(charArray.length));
			str=str+charArray[abs];
		}
		return str;
	}
}
