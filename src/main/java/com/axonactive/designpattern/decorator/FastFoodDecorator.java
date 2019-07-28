package com.axonactive.designpattern.decorator;

import com.axonactive.designpattern.FastFood;

public abstract class FastFoodDecorator extends FastFood {
	private FastFood fastFood;
	
	public FastFoodDecorator(FastFood fFood) {
		this.fastFood = fFood;
	}

	public void serve() {
		this.fastFood.serve();
	}
}
