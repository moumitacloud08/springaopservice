package com.example.aopservice.beans;

import org.springframework.stereotype.Component;

@Component
public class TaxBean2 {
	public float calculateTax(float value) {
		return 5f;
	}

}
