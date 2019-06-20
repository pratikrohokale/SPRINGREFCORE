package com.nt.strategy;

public class Viechle {
	private  Engine engg;

	public void setEngg(Engine engg) {
		this.engg = engg;
	}
	
	public  void move(){
		engg.start();
		System.out.println("Vichle is moved");
	}
	
	public void park(){
		System.out.println("Viechle is parked");
		engg.stop();
	}
}
