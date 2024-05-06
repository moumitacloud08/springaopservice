package com.example.aopservice.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DepartmentRepositoryAspect {
	
	@Before("@within(com.example.aopservice.annotation.MonitoredRepository)")
	public void annotationWithinExample() {
		System.out.println("Before - annotationWithinExample");
	}
	
	@Before("@target(com.example.aopservice.annotation.MonitoredRepository)")
	public void annotationTargetExample() {
		System.out.println("Before - annotationTargetExample");
	}

}
