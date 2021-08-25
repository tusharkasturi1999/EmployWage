package com.employeeWage;

public class EmpWageBuilderArray
{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME =2;
	
	private int numOfCompany = 0;
	private EmployeeWage[] EmpWageArray;
	

	public EmpWageBuilderArray() {
		EmpWageArray = new EmployeeWage[5];
		
	}
	
	private void addEmployeeWage(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
	{
		EmpWageArray[numOfCompany] = new EmployeeWage(company,EMP_RATE_PER_HOUR,NUM_WORKING_DAYS,MAX_HRS_IN_MONTH);
		numOfCompany++;
	}
	
	private void wageCalculator() {
		for(int i = 0;i<numOfCompany;i++) {
			EmpWageArray[i].setTotalEmpWage(this.wageCalculator(EmpWageArray[i]));
			System.out.println(EmpWageArray[i]);
		}
	}
	
	
	//method for calculating employee wages for different companies
	public int wageCalculator(EmployeeWage employeewage)
	{
		//local variables
		int Emp_Hrs=0;		
		int TotalEmpHrs=0;
		int TotalWorkingDays=0; 
		
		//computation
		while(TotalEmpHrs<= employeewage.MAX_HRS_IN_MONTH && TotalWorkingDays<employeewage.NUM_WORKING_DAYS)
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
		return TotalEmpHrs*employeewage.EMP_RATE_PER_HOUR;
					
		}
				
	
	public static void main(String[] args) 
	{

		EmpWageBuilderArray empwagearray = new EmpWageBuilderArray();
		empwagearray.addEmployeeWage("Dmart", 20, 2, 10);
		empwagearray.addEmployeeWage("Reliance", 10, 4, 20);
		empwagearray.wageCalculator();
		
     }
}

