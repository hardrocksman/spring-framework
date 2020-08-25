package com.spring.test.zhl;


import com.spring.test.zhl.model.MyOrder;
import com.spring.test.zhl.service.OrderService;
import com.spring.test.zhl.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AopTest {

	public static void main(String[] args) {
//		System.out.println("test");
//		// 测试ClassPathXmlApplicationContext
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		//2.通过IOC容器对象来得到Helloworld对应的对象，利用bean id来唯一标识这个对象

		OrderService orderService = applicationContext.getBean(OrderService.class);
		MyOrder myOrder = orderService.getOrder(1);
		System.out.println("result:" + myOrder);
		orderService.createOrder(2, "222");


		AccountServiceImpl accountService = applicationContext.getBean(AccountServiceImpl.class);
		accountService.add();
		accountService.subtract();
//		System.out.println("result:" + myOrder);
	}
}
