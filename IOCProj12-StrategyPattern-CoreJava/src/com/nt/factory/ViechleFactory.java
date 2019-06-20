package com.nt.factory;

import com.nt.strategy.CNGEngine;
import com.nt.strategy.DiselEngine;
import com.nt.strategy.Engine;
import com.nt.strategy.PetrolEngine;
import com.nt.strategy.Viechle;

public class ViechleFactory {
	
	
	public static  Viechle   getInstance(String engineType){
		    Viechle viechle=null;
		    Engine engg=null;
		    
		    viechle=new Viechle();
		    if(engineType.equals("petrol"))
		    	engg= new PetrolEngine();
		    else if(engineType.equals("diesel"))
		    	engg=new DiselEngine();
		    else if(engineType.equals("CNG"))
		    	engg=new CNGEngine();
		    //set Engine to Viechle
		    viechle.setEngg(engg);
		    return viechle;
	}//method
}//class
