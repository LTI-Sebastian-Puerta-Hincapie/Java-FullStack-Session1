package com.lti.service;

// Business service class
public class BasicCal {
	
	public int addition(int a, int b) {
		return a + b;
	}
	
	public int substraction(int a, int b) {
		return a - b;
	}
	
	public int multiplication(int a, int b) {
		return a * b;
	}
	
	public int division(int a, int b) {
		return a / b;
	}
	
	public static String myStaticMethod() {
		return "I am a static method";
	}
}
