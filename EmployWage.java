package com.employeeWage;

public class EmployWage {
	
	public static final int IS_Part_Time = 1;// @param IS_Part_Time is used to check job status
	public static final int IS_FULL_TIME = 2; // @param IS_FULL_TIME is used to check job status
	
	public int WAGE_PER_HR; // @param WAGE_PER_HR is used to assign wage per hour
	public int workdays;  //@param workdays is used to assign workdays for a company
	public int workhours; //@param workhours is used to assign workhours for a company
	
	/* Constructor
		EmployWage(int WAGE_PER_HR,int workdays,int workhours){
		this.WAGE_PER_HR = WAGE_PER_HR;
		this.workdays = workdays;
		this.workhours = workhours;
	}
	*/
	
	// This is the method to calculate monthly wages
	public void calculation(String companyName,int WAGE_PER_HR,int workdays,int workhours) {
		
		// Initializing variables
		int totalwage =0;
		int empHrs = 0;
		int empWage = 0;
		int totalworkdays = 0;
		int totalworkhours = 0;
		
		System.out.println(companyName);
		
		// Computation
		while (totalworkdays < workdays && totalworkhours < workhours) {
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
		}
		System.out.println("Employee Wage per Month: Rs.  " + totalwage);
		System.out.println();
		System.out.println();

	}
	
		

	public static void main(String[] args) {
		System.out.println("Welcome to Employ Wage");
		System.out.println();
		System.out.println();
		
		//Creating onjects for each company
		EmployWage company = new EmployWage();

		
		
		company.calculation("TATA",30,20,100);
		company.calculation("RELIANCE",25,25,95);
		company.calculation("DMART",20,30,100);
		
	}

}
