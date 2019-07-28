package com.axonactive.designpattern.abstractfactory;

public class AbstarctFactoryProvider {
	public static FastFoodAbstractFactory getAbstractFactory(String factory) {
		if(factory == "kfc") {
			return new KFCFactory();
		} else if(factory == "mcdonald") {
			return new McDonaldsFactory();
		}
		return null;
	}
}
