package com.nt.beans;

public class TravelAgent {
		private Tourplan tp;

	/*public TravelAgent() {
		System.out.println("TravelAgent:0-param constructor");
	}*/
	
	public TravelAgent(Tourplan tp) {
		System.out.println("TravelAgent:1-param constructor");
		this.tp = tp;
	}
	
	public void setTp(Tourplan tp) {
		System.out.println("TravelAgent:setTp(-) method");
		this.tp = tp;
	}
	
	public void planTour(){
		System.out.println("All set to visit places::"+tp);
	}

}
