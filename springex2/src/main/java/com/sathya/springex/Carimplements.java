package com.sathya.springex;

public class Carimplements implements Vehicle {
	
	private String Fueltype;
	private int Maxspeed;
	public String getFueltype() {
		return Fueltype;
	}
	public void setFueltype(String fueltype) {
		Fueltype = fueltype;
	}
	public int getMaxspeed() {
		return Maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		Maxspeed = maxspeed;
	}
	public void move() {
		System.out.println("your selected car");
		System.out.println("fueltype"+Fueltype);
		System.out.println("maxspeed"+Maxspeed);
	}
	
}
