package com.sathya.lambokex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;

}
