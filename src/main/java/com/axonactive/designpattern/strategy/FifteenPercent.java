package com.axonactive.designpattern.strategy;

public class FifteenPercent implements PayStrategy {

	public float doPay(float price) {
		return (float) (price*1.15);
	}

}
