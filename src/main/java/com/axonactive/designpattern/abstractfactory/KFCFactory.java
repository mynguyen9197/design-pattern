package com.axonactive.designpattern.abstractfactory;

import com.axonactive.designpattern.FastFood;
import com.axonactive.designpattern.KFCFriedChicken;
import com.axonactive.designpattern.KFCHamburger;

public class KFCFactory implements FastFoodAbstractFactory{

	public FastFood createFood(KindOfFood stuff) {
		switch (stuff) {
		case HAMBURGER:
			return new KFCHamburger();
		case FRIED_CHICKEN:
			return new KFCFriedChicken();
		default:
			return null;
		}
	}
}
