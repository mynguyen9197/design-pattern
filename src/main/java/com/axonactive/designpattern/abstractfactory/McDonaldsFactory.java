package com.axonactive.designpattern.abstractfactory;

import com.axonactive.designpattern.FastFood;
import com.axonactive.designpattern.McDonaldsFriedChicken;
import com.axonactive.designpattern.McDonaldsHamburger;

public class McDonaldsFactory implements FastFoodAbstractFactory {

	public FastFood createFood(KindOfFood stuff) {
		switch (stuff) {
		case HAMBURGER:
			return new McDonaldsHamburger();
		case FRIED_CHICKEN:
			return new McDonaldsFriedChicken();
		default:
			return null;
		}
	}

}
