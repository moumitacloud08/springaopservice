package com.example.aopservice;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aopservice.beans.HelloChildBean;

public class Runner {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.registerShutdownHook();
		
		HelloChildBean springBean = context.getBean(HelloChildBean.class);
		springBean.sayHello("John",6);
		springBean.validateName("John");
		springBean.saveCounterValue(2);

	}

}
