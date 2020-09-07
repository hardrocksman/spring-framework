package com.spring.demo.advice;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class TestBAdvice {

	/**
	 *前置通知
	 */
	public void before(JoinPoint joinPoint) {
		//获取节点名称
		String name = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println(name + "方法调用前：获取调用参数" + Arrays.toString(args));
	}

	/**
	 *后置通知 总会执行 但是不能访问到返回值
	 */
	public void after(JoinPoint joinPoint) {
		System.out.println("后置通知");
	}
}
