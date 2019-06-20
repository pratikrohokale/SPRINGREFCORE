package com.nt.beans;

public class Batsman {
	private  Bat  bat;
	private String team;
	public void setBat(Bat bat) {
		this.bat = bat;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	public  void  doBatting(){
		System.out.println(team+" :Batsman started batting");
		bat.hitRuns();
	}

}//class
