package com.lti.service;

public class NormalClass extends AbstractClass {
	
	public String NormalImp() {
		
		return "Normal Impl method";
	}

	@Override
	public String testNonImp() {
		// TODO Auto-generated method stub
		return "Implementing method in child class";
	}

}
