package com.employeeWage;


public class EmployeeWage
{
	//class members
	public final String company;
	public final int EMP_RATE_PER_HOUR;
	public final int NUM_WORKING_DAYS;
	public final int MAX_HRS_IN_MONTH;
	public int Total_Wage;
	
	//Parameterized constructor for initializing members of a class
	public EmployeeWage(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
	{
		this.company=company;
		this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
		
	}
	
	public void setTotalEmpWage(int Total_wage) 
	{
		this.Total_Wage = Total_wage;
	}
	
	
	@Override
	public String toString()
	{
		return "Total Emp Wage for compay: "+company+ " is: "+Total_Wage;
	}
}

