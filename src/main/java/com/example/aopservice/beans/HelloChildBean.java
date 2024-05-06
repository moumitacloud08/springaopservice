package com.example.aopservice.beans;

import org.springframework.stereotype.Component;
import java.io.IOException;

@Component("hello_child_bean")
public class HelloChildBean extends HelloBean{
	
	@Override
	public void sayHello(String name, int ex) {
		System.out.println("Hello from Spring Child Bean for "+name);
	}
	
	public void validateName(String name) throws IOException{
		
	}

}
