package com.employeeWage;

public class EmployWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employ Wage");

		int IS_FULL_TIME = 1; // @param IS_FULL_TIME is used to check job status
		// Computation
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		
	}

}
