package com.nt.beans;

import java.util.Arrays;

public class Tourplan {
	private String[]  places;

	public void setPlaces(String[] places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "Tourplan [places=" + Arrays.toString(places) + "]";
	}
	

}
