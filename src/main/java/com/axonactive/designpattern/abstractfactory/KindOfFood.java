package com.axonactive.designpattern.abstractfactory;


public enum KindOfFood {
	HAMBURGER(1), FRIED_CHICKEN(2);
	
	public int getValue() {
		return value;
	}

	private int value;
	
	private KindOfFood(int val) {
		this.value = val;
	}
}
