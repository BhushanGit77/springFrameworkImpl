package com.bhushan.DemoSpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Autowired
	private Tyre tyre;
	
	/*ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
	
	Tyre tyre = (Tyre) context1.getBean("tyre"); */
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("Car " + tyre);
	}

}
