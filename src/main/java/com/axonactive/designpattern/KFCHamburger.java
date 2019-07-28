package com.axonactive.designpattern;

public class KFCHamburger extends FastFood {

	public KFCHamburger(float price) {
		super(price);
	}

	public KFCHamburger() {
		// TODO Auto-generated constructor stub
	}

	public void serve() {
		System.out.println("This is Hamburger of KFC");
	}

}
