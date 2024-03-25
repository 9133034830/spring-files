package com.sathya.springex;

public class Person {
	private String name;
	private String emailId;
	
	public Person(String name, String emailId) {
		super();
		this.name = name;
		this.emailId = emailId;
	}

	public void Info() {
		System.out.println("hey"+name+"your email is ready");
		System.out.println("hey check the mail"+emailId);
	}

}
