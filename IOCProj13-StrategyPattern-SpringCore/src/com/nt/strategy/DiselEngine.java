package com.nt.strategy;

public class DiselEngine implements Engine {

	@Override
	public final void start() {
		System.out.println("Diesel Engine:: started");
		
	}

	@Override
	public final void stop() {
		System.out.println("Diesel  Engine: stopped");
		
	}
	
	

}
