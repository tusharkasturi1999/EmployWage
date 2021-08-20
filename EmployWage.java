package com.employeeWage;

public class EmployWage {
	public static final int IS_Part_Time = 1;// @param IS_Part_Time is used to check job status
	public static final int WAGE_PER_HR =20; // @param WAGE_PER_HR is used to assign wage per hour
	public static final int IS_FULL_TIME = 2; // @param IS_FULL_TIME is used to check job status
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employ Wage");

		int empHrs =0;
        int empWage = 0;
		
		// Computation
		double empcheck = Math.floor(Math.random() * 10) % 3;
		
		if (empcheck == IS_FULL_TIME) {
        	empHrs = 8;
        	empWage = WAGE_PER_HR * empHrs;
        }
		else if (empcheck == IS_Part_Time) {
        	empHrs = 4;
        	empWage = WAGE_PER_HR * empHrs;
        }
        else {
        	empHrs = 0;
        	empWage = WAGE_PER_HR * empHrs;
        }
        System.out.println("Employee Wage: Rs.  " + empWage);

	}

}
