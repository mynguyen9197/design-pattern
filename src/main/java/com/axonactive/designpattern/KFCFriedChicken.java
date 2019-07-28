package com.axonactive.designpattern;

public class KFCFriedChicken extends FastFood{

	public KFCFriedChicken(float price) {
		super(price);
	}

	public KFCFriedChicken() {
		// TODO Auto-generated constructor stub
	}

	public void serve() {
		System.out.println("This is Chicken of KFC");
	}

}
