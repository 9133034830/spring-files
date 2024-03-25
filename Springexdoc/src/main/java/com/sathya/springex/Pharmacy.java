package com.sathya.springex;

public class Pharmacy {
	private String name;
	private String location;
	public Pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
  public void pharInfo() {
	  System.out.println("hey"+name+"yourlocation"+location);
  }
}
