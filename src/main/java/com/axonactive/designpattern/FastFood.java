package com.axonactive.designpattern;

public abstract class FastFood {
	private float price;
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	};
	
	public FastFood(float price) {
		this.price = price;
	}
	
	public FastFood() {
		this.price = 0;
	}
	
	public void serve() {}
}
