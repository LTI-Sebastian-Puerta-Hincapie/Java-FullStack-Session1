package com.lti.app;

import com.lti.service.BasicCal;
import com.lti.service.NormalClass;
import com.lti.service.SicCal;
import com.lti.test.A;
import com.lti.test.B;
import com.lti.test.C;
import com.lti.test.D;
import com.lti.test.E;

public class CalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SicCal calculator = new SicCal();
		System.out.println("Addition Result: " + calculator.addition(10,10));
		System.out.println("Substraction Result: " + calculator.substraction(20,10));
		System.out.println("Multiplication Result: " + calculator.multiplication(10,10));
		System.out.println("Division Result: " + calculator.division(20,10));
		System.out.println("Square Root Result: " + calculator.squareRoot(100));
		System.out.println("Sinx Result: " + calculator.sinx(0.5));
		
		System.out.println("Static method result: " + BasicCal.myStaticMethod());
		System.out.println("\n");
		
		// --------------------------------------------------------
		A a = new A();
		a.name();
		a.act();
		System.out.println("\n");
		
		// single: B extends A
		B b = new B();
		b.name();
		b.biking();
		b.act();
		System.out.println("\n");
		
		// multi-level: C extends B which extends A
		C c = new C();
		c.name();
		c.cook();
		c.biking();
		c.act();
		System.out.println("\n");
		
		// hierarchy - two different class derive from the same base class
		b = new B();
		b.name();
		b.biking();
		b.act();
		
		D d = new D();
		d.name();
		d.dance();
		d.act();
		System.out.println("\n");
		
		// Abstract
		NormalClass normal = new NormalClass();
		System.out.println(normal.NormalImp());
		System.out.println(normal.testImpl());
		System.out.println(normal.testNonImp());
		
		
	}
}
