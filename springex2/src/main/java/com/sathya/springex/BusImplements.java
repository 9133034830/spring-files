package com.sathya.springex;

public class BusImplements implements Vehicle {
	private String Bustype;
	private int Maxspeed;
	public String getBustype() {
		return Bustype;
	}
	public void setBustype(String bustype) {
		Bustype = bustype;
	}
	public int getMaxspeed() {
		return Maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		Maxspeed = maxspeed;
	}
    public void move() {
    	System.out.println("your selected Bus");
    	System.out.println("Bustype"+Bustype);
    	System.out.println("Fueltype"+Maxspeed);
    }
}
