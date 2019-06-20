package com.nt.strategy;

public class Viechle {
	private  Engine engg;
	private int viechleId;
	private String owner;

	public void setViechleId(int viechleId) {
		this.viechleId = viechleId;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

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
