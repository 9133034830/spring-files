package com.sathya.springex;

public class Traveller {
	private String name;
	private String email;
	private long mobile;
	Vehicle Vehicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Vehicle getVehicle() {
		return Vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		Vehicle = vehicle;
	}
	public void Startjourny() {
		System.out.println("hey"+name+"welcome to travel world");
		System.out.println("check your mobile"+mobile+"email"+email);
		Vehicle.move();
	}

}
