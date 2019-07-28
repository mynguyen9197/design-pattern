package com.axonactive.designpattern.decorator;

import com.axonactive.designpattern.FastFood;

public class FriesBonus extends FastFoodDecorator {

	public FriesBonus(FastFood fFood) {
		super(fFood);
	}
	
	@Override
	public void serve() {
		super.serve();
		bonusFriesSet();
	}

	private void bonusFriesSet() {
		System.out.println("and a free fries set! Enjoy!");
	}
}
