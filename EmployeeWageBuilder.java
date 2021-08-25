package com.employeeWage;

public class EmployeeWageBuilder implements IComputeEmpWage
{
	//class members
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME =2;
	
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	//parameterised constructor for initializing members of a class
	public EmployeeWageBuilder()
	{
		companyEmpWageArray=new CompanyEmpWage[5];
		
	}
	
	public void addCompanyEmpWage(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
	{
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company, EMP_RATE_PER_HOUR, NUM_WORKING_DAYS, MAX_HRS_IN_MONTH);
		numOfCompany++;
	}
	
	public void computeEmpWage()
	{
		for(int i=0;i<numOfCompany;i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	//method for calculating employee wages for different companies
	private int computeEmpWage(CompanyEmpWage companyEmpWage)
	{	
		//local variables
		int Emp_Hrs=0;
		int TotalEmpHrs=0;
		int TotalWorkingDays=0;
		//computation
		while(TotalEmpHrs<=companyEmpWage.MAX_HRS_IN_MONTH && TotalWorkingDays<companyEmpWage.NUM_WORKING_DAYS)
		{
			TotalWorkingDays+=1;
			int empCheck=(int) (Math.floor(Math.random()*10)%3);
			switch (empCheck) 
			{
			case  IS_FULL_TIME: Emp_Hrs=16;break;
			case IS_PART_TIME: Emp_Hrs=8;break;
			default: Emp_Hrs=0;
			}
			TotalEmpHrs+=Emp_Hrs;
			System.out.println("Day#: "+TotalWorkingDays+" Emp Hr: "+TotalEmpHrs);
		}
		
		return TotalEmpHrs*companyEmpWage.EMP_RATE_PER_HOUR;
					
	}
				
	
	public static void main(String[] args) 
	{

		EmployeeWageBuilder empWageBuilder =new EmployeeWageBuilder();
		
		empWageBuilder.addCompanyEmpWage("DMart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Reliance",10,4,20);
		empWageBuilder.computeEmpWage();
		
		
	}
}