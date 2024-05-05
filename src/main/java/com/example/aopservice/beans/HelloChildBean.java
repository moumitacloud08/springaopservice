package com.example.aopservice.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloChildBean extends HelloBean{
	
	@Override
	public void sayHello(String name) {
		System.out.println("Hello from Spring Child Bean for "+name);
	}

}
