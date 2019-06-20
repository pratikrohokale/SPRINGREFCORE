package com.nt.strategy;

public class PetrolEngine implements Engine {

	@Override
	public final void start() {
		System.out.println("Petrol Engine:: started");
		
	}

	@Override
	public final void stop() {
		System.out.println("Pertrol  Engine: stopped");
		
	}
	
	

}
