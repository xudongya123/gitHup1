package com.xdy.util;

import java.util.Random;

public class StringUtil {
	
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
		
		return src !=null && src.length()>0;
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src){
		
		return src !=null && src.trim().length()>0;
	}
	//方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”(5分)
	public static String randomChineseString(int n){
		String string="你还好吗我很好啊可克服困难放开手圣诞树到那时的萨迪克那是肯定拿阿萨德卡上打开了电脑健身卡计数的那是的";
		char[] charArray=string.toCharArray();
		Random random = new Random();
		String str="";
		for (int i = 0; i < n; i++) {
			int abs=Math.abs(random.nextInt(charArray.length));
			str=str+charArray[abs];
		}
		return str;
	}
	
	//方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
	public static String generateChineseName(int n){
		String string="徐李郭王赵苗党刘";
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
