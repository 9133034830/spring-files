package com.sathya.lambokex;

public class Lambokex1 {
	public static void main(String[]args) {
		//constructor injecting the values
		Employee employee=new Employee(111, "ram",1000.0);
		System.out.println(employee);
		
		
		//setters are injecting the values
		Employee employe=new Employee();
		employee.setEmpId(110);
		employee.setEmpName("ram");
		employee.setEmpSalary(10000);
		System.out.println(employee.getEmpId()+ " "+employee.getEmpName()+" "+ employee.getEmpSalary());
		
	}

}