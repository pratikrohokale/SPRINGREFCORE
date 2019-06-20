package com.nt.test;

import com.nt.factory.ViechleFactory;
import com.nt.strategy.Viechle;

public class StrategyPatternTest {

	public static void main(String[] args) {
		 Viechle viechle=null;
		// Get Viechle class object
		 viechle=ViechleFactory.getInstance("diesel");
		 viechle.move();
		 viechle.park();
	}

}
