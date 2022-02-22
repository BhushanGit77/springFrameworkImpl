package com.bhushan.DemoSpringFramework;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public void drive() {
		System.out.println("Bhag raha hai...");
	}

}
