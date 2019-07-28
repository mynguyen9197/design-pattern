package com.axonactive.designpattern.strategy;

public class Payment {
	PayStrategy payStrategy;
	
	public Payment(PayStrategy pay) {
		this.payStrategy = pay;
	}
	
	public float total(float f) {
		return this.payStrategy.doPay(f);
	}
}
