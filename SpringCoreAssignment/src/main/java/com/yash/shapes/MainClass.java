package com.yash.shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yash/shapes/applicationContext.xml");
		Shape shape=(Shape)ctx.getBean("shape");
		
	}

}
