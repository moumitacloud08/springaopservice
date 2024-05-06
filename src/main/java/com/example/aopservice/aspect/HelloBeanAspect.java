package com.example.aopservice.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloBeanAspect {
	
	@Before("execution(public !int com..HelloBean.say*(String, *))")
	public void executionExample() {
		System.out.println("Before - execution example");
	}
	
	@After("execution(void com..HelloChildBean.validateName(..) throws java.io.IOException)")
	public void executionWithExceptionExample() {
		System.out.println("After - execution with exception example");
	}
	
	@Before("within(com..HelloChildBean)")
	public void withinExample1() {
		System.out.println("Before - withinExample1");
	}
	
	@Before("within(com..*)")
	public void withinExample2() {
		System.out.println("Before - withinExample2");
	}
	
	@Before("within(com..Hello*Bean)")
	public void withinExample3() {
		System.out.println("Before - withinExample3");
	}
	
	@Before("args(..)")
	public void argsExample1() {
		System.out.println("Before - argsExample1");
	}
	
	@Before("args(String, int)")
	public void argsExample2() {
		System.out.println("Before - argsExample2");
	}
	
	@Before("args(String, *)")
	public void argsExample3() {
		System.out.println("Before - argsExample3");
	}
	
	@Before("args(java.lang.String)")
	public void argsExample4() {
		System.out.println("Before - argsExample4");
	}
	
	@Before("bean(hello_child_bean)")
	public void beanExample1() {
		System.out.println("before - beanExample1");
	}
	
	@Before("bean(hello_*_bean)")
	public void beanExample2() {
		System.out.println("before - beanExample2");
	}
	
	@Before("@annotation(com.example.aopservice.annotation.CustomTransaction)")
	public void annotationExample() {
		System.out.println("Before - annotationExample");
	}

}
