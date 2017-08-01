package com.sixo.quartz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
	public void test() {
		
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-quartz.xml");
	}
}
