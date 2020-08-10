package com.spring.test.hardrock;

import com.spring.test.hardrock.config.TestConfig;
import com.spring.test.hardrock.service.HelloService;
import com.spring.test.hardrock.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		System.out.println("test");
//
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
//		//2.通过IOC容器对象来得到Helloworld对应的对象，利用bean id来唯一标识这个对象
//		HelloService helloWorld = applicationContext.getBean(HelloService.class);
//		//3.调用sayHello()方法
//		String result = helloWorld.sayHello("hard");
//
//		System.out.println("result:" + result);

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
		HelloService helloService = ac.getBean(HelloService.class);
		String result = helloService.sayHello("hard");
		System.out.println("result:" + result);

		OrderService orderService = ac.getBean(OrderService.class);

		List<String> name = new ArrayList<String>();
		name.add("123");
		name.add("345");
		orderService.saveOrders(name);
	}
}
