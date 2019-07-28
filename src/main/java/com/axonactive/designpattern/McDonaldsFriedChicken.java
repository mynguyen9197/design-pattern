package com.axonactive.designpattern;

public class McDonaldsFriedChicken extends FastFood {

	public McDonaldsFriedChicken(float price) {
		super(price);
	}

	public McDonaldsFriedChicken() {
		// TODO Auto-generated constructor stub
	}

	public void serve() {
		System.out.println("This is fried chicken of McDonald");
	}
}
