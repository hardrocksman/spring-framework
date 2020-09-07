package com.spring.demo;

import com.spring.demo.service.TestAService;
import com.spring.demo.service.TestBService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
//		// 测试ClassPathXmlApplicationContext
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

		TestAService aService = applicationContext.getBean(TestAService.class);
		aService.sayHello("spring");
		aService.sayBye("spring");

//		TestBService bService = applicationContext.getBean(TestBService.class);
//		bService.sayHello("spring");
//		bService.sayBye("spring");
	}
}
