package com.example.aopservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aopservice.beans.HelloChildBean;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.registerShutdownHook();
		
		HelloChildBean springBean = context.getBean(HelloChildBean.class);
		springBean.sayHello("John");
		

	}

}
