package com.axonactive.designpattern.strategy;

public class TenPercent implements PayStrategy{

	public float doPay(float price) {
		if(price>100) return price;
		else return (float) (price*1.1);
	}
}
