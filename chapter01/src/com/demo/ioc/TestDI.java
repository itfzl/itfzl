package com.demo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
	public static void main(String[] args) {
		// 加载spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取对象实例
		UserService userService = (UserService) applicationContext.getBean("userService");
		// 调用userService 的say方法
		userService.say();
	}
}
