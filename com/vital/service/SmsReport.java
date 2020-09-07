package com.vital.service;

public class SmsReport implements IReporter{

	@Override
	public void alert(String name, String message) {
		System.out.println("Alert via SMS : "+ name + " "+ message);
	}

}
