package com.spring.test.hardrock;

import com.spring.test.hardrock.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("test");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		//2.通过IOC容器对象来得到Helloworld对应的对象，利用bean id来唯一标识这个对象
		HelloService helloWorld = applicationContext.getBean(HelloService.class);
		//3.调用sayHello()方法
		String result = helloWorld.sayHello("hard");

		System.out.println("result:" + result);
	}
}
