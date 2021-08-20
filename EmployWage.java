package com.employeeWage;

public class EmployWage {
	public static final int IS_Part_Time = 1;// @param IS_Part_Time is used to check job status
	public static final int WAGE_PER_HR = 20; // @param WAGE_PER_HR is used to assign wage per hour
	public static final int IS_FULL_TIME = 2; // @param IS_FULL_TIME is used to check job status

	public static void main(String[] args) {
		System.out.println("Welcome to Employ Wage");

		int empHrs = 0;
		int empWage = 0;
		int workdays = 20;

		// Computation
		for (int i = 1; i <= workdays; i++) {
			double empcheck = Math.floor(Math.random() * 10) % 3;

			switch ((int) empcheck) {
			case IS_FULL_TIME: {
				empHrs = 8;
				empWage = WAGE_PER_HR * empHrs;
				break;
			}
			case IS_Part_Time: {
				empHrs = 4;
				empWage = WAGE_PER_HR * empHrs;
				break;
			}
			default: {
				empHrs = 0;
				empWage = WAGE_PER_HR * empHrs;
				break;
			}

			}
			empWage += empWage;
		}
		System.out.println("Employee Wage per Month: Rs.  " + empWage);

	}

}
