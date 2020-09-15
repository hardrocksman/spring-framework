package com.spring.test.cycle;

import com.spring.test.cycle.config.TestCycleConfig;
import com.spring.test.cycle.service.AService;
import com.spring.test.cycle.service.BService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCycleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestCycleConfig.class);

		AService aService = ac.getBean(AService.class);
		aService.say("hei");
		BService bService = ac.getBean(BService.class);
		bService.hello("back ");
	}
}
