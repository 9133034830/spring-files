package com.sathya.springex;

public class Doctor {
	private int id;
	private String name;
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void doctorInfo() {
		System.out.println("hey"+name+"your id"+id);
	}

}
