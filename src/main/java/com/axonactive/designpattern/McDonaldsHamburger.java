package com.axonactive.designpattern;

public class McDonaldsHamburger extends FastFood{

	public McDonaldsHamburger(float price) {
		super(price);
	}

	public McDonaldsHamburger() {
	}

	public void serve() {
		System.out.println("This is Hamburger of McDonald");
	}
}
