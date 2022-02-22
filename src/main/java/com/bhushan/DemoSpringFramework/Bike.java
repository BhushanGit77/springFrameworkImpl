package com.bhushan.DemoSpringFramework;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	public void drive() {
		System.out.println("Chal rahi hai...");
	}

}
