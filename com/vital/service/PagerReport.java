package com.vital.service;

public class PagerReport implements IReporter{

	@Override
	public void alert(String name, String message) {
		System.out.println("Alert via Pager : "+ name + " "+ message);
	}

}
