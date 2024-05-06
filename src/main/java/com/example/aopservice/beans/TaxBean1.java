package com.example.aopservice.beans;

public class TaxBean1 implements ITaxBean {

	@Override
	public float calculateTax(float value) {
		return 5f;
	}

}
