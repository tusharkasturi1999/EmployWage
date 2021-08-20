package com.employeeWage;

public class EmployWage {
	public static final int IS_Part_Time = 1;// @param IS_Part_Time is used to check job status
	public static final int WAGE_PER_HR = 20; // @param WAGE_PER_HR is used to assign wage per hour
	public static final int IS_FULL_TIME = 2; // @param IS_FULL_TIME is used to check job status
	public static final int workdays = 20;
	public static final int workhours = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employ Wage");

		int totalwage =0;
		int empHrs = 0;
		int empWage = 0;
		int totalworkdays = 0;
		int totalworkhours = 0;

		// Computation
		while (totalworkdays < 20 && totalworkhours < 100) {
			double empcheck = Math.floor(Math.random() * 10) % 3;

			switch ((int) empcheck) {
			case IS_FULL_TIME: {
				empHrs = 8;
				empWage = WAGE_PER_HR * empHrs;
				totalworkhours = totalworkhours + 8;
				totalworkdays++;
				System.out.println("Day " + totalworkdays + ": Full-time. Hours done : " + totalworkhours);
				break;
			}
			case IS_Part_Time: {
				empHrs = 4;
				empWage = WAGE_PER_HR * empHrs;
				totalworkhours = totalworkhours + 4;
				totalworkdays++;
				System.out.println("Day " + totalworkdays + ": Part-time. Hours done : " + totalworkhours);
				break;
			}
			default: {
				empHrs = 0;
				totalworkhours = totalworkhours + 0;
				System.out.println("Day " + totalworkdays + ": Absent. Hours done : " + totalworkhours);
				break;
			}

			}
			totalwage = totalwage + empWage;
			System.out.println("Employee Wage till now: Rs.  " + totalwage);
		}
		System.out.println("Employee Wage per Month: Rs.  " + totalwage);

	}

}
