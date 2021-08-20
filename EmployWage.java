package com.employeeWage;

public class EmployWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employ Wage");
		
		int WAGE_PER_HR =20; // @param WAGE_PER_HR is used to assign wage per hour
        int FULL_WORKING_DAY =8; // @param IS_FULL_TIME is used to assign full working day time
		int IS_FULL_TIME = 1; // @param IS_FULL_TIME is used to check job status
		int empHrs =0;
        int empWage = 0;
		
		// Computation
		double empcheck = Math.floor(Math.random() * 10) % 2;
		
		if (empcheck == IS_FULL_TIME)

        {
        	empHrs = FULL_WORKING_DAY;
        	empWage = WAGE_PER_HR * empHrs;
        }
        else
        {
        	empHrs = 0;
        	empWage = WAGE_PER_HR * empHrs;
        }
        System.out.println("Employee Wage: Rs.  " + empWage);

	}

}
