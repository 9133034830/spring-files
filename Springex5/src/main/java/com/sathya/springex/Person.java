package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class Person {
	private HomeLoanService homeLoanService;
	private RealestateService realestateService;
	@Autowired
	public Person(HomeLoanService homeLoanService, RealestateService realestateService) {
		super();
		this.homeLoanService = homeLoanService;
		this.realestateService = realestateService;
	}
	public void info() {
		homeLoanService.LoanInfo();
		realestateService.realestateInfo();
	}
	
	

}
