package com.example.aopservice.beans;

import org.springframework.stereotype.Component;

import com.example.aopservice.annotation.CustomTransaction;

import java.io.IOException;

@Component("hello_child_bean")
public class HelloChildBean extends HelloBean{
	
	@Override
	public void sayHello(String name, int ex) {
		System.out.println("Hello from Spring Child Bean for "+name);
	}
	
	public void validateName(String name) throws IOException{}
	
	@CustomTransaction
	public void saveCounterValue(int counterValue) {
		
	}

}
