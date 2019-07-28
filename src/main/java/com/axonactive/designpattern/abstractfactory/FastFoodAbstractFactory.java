package com.axonactive.designpattern.abstractfactory;

import com.axonactive.designpattern.FastFood;

public interface FastFoodAbstractFactory {
	FastFood createFood(KindOfFood stuff);
}
