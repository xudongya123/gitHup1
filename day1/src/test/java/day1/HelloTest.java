package day1;

import org.junit.Test;

public class HelloTest {
	
	@Test//测试
	public void sayHelloTest(){
		
		Hello hello = new Hello();
		hello.sayHello();//调用
	}
}
