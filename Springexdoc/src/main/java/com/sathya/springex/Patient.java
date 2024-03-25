package com.sathya.springex;

public class Patient {
	private String name;
	private int age;
	private String doctor;
	private String pharmacy;
	public Patient(String name, int age, String doctor, String pharmacy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}
public void details() {
	System.out.println("hey"+name+"age"+age);
	System.out.println("your doctor is"+doctor+"pharma is"+pharmacy);
}
}
