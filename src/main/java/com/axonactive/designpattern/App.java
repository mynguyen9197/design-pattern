package com.axonactive.designpattern;

import com.axonactive.designpattern.abstractfactory.AbstarctFactoryProvider;
import com.axonactive.designpattern.abstractfactory.FastFoodAbstractFactory;
import com.axonactive.designpattern.abstractfactory.KindOfFood;
import com.axonactive.designpattern.decorator.FriesBonus;
import com.axonactive.designpattern.strategy.Payment;
import com.axonactive.designpattern.strategy.TenPercent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/**
    	 * AF
    	 */
//        FastFoodAbstractFactory abstractFactory = AbstarctFactoryProvider.getAbstractFactory("kfc");
//        FastFood fastFood1 = abstractFactory.createFood(KindOfFood.FRIED_CHICKEN);
//        fastFood1.serve();
//        
//        FastFoodAbstractFactory abstractFactory2 = AbstarctFactoryProvider.getAbstractFactory("mcdonald");
//        FastFood fastFood2 = abstractFactory2.createFood(KindOfFood.HAMBURGER);
//        fastFood2.serve();
    	
    	/**
    	 * Decorator
    	 */
//    	FastFood firstSet = new FriesBonus(new KFCFriedChicken());
//    	firstSet.serve();
//    	
//    	FastFood secondSet = new McDonaldsFriedChicken();
//    	secondSet.serve();
    	
    	/**
    	 * Strategy
    	 */
    	Payment payment = new Payment(new TenPercent());
    	System.out.println(payment.total(new McDonaldsHamburger(10).getPrice()));
    }
}
