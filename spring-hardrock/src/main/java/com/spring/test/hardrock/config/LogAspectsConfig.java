package com.spring.test.hardrock.config;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspectsConfig {

	@Pointcut("execution(* com.spring.test.hardrock.service.impl.HelloServiceImpl.*(..))")
	public void pointCut(){};

	//@before代表在目标方法执行前切入, 并指定在哪个方法前切入
	@Before("pointCut()")
	public void logStart(){
		System.out.println("@Before before execute");
	}

	@After("pointCut()")
	public void logEnd(){
		System.out.println("@after after execute");
	}

	@AfterReturning("pointCut()")
	public void logReturn(){
		System.out.println("@After returning");
	}

	@AfterThrowing("pointCut()")
	public void logException(){
		System.out.println("@after throwing");
	}

	@Around("pointCut()")
	public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("@Arount:before execute...");
		Object obj = proceedingJoinPoint.proceed();//相当于开始调div地
		System.out.println("@Arount:after execute...");
		return obj;
	}
}
