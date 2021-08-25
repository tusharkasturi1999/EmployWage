package com.employeeWage;

public interface IComputeEmpWage  //interface
{

	public void addCompanyEmpWage(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH ); //to add empwage to each company
	public void computeEmpWage(); //to compute employee wage
	public int getTotalWage(String company);
}


