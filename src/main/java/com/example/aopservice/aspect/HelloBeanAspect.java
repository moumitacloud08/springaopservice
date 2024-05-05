package com.example.aopservice.aspect;

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

}
