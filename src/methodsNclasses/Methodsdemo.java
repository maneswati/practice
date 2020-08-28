package methodsNclasses;

import java.util.Scanner;

public class Methodsdemo 
{

	public void salaryInput() 
	{
		double gross_salary,incomeTax, providentFund, ProfessionalTax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gross salary of Employee : ");
		gross_salary=sc.nextDouble();
		System.out.println("Enter the income tax of Employee : ");
		incomeTax=sc.nextDouble();
		System.out.println("Enter the provident fund of Employee : ");
		providentFund=sc.nextDouble();
		System.out.println("Enter the professional tax of Employee : ");
		ProfessionalTax=sc.nextDouble();
		System.out.println("Enter the how many year employee is service in company :");
		double emp=sc.nextDouble();			
		calculation( gross_salary,incomeTax, providentFund, ProfessionalTax,emp);
	}
	
	public void calculation(double gross_salary, double incomeTax,double providentFund, double ProfessionalTax, double emp)

	{
		double result,netsalary;
	    double salary=gross_salary-(incomeTax+providentFund+ProfessionalTax);
	    //System.out.println(netSalary);
	    if(emp>=5)
	    {
	    	 result=(salary*35)/100;
	    	 netsalary=result+salary;
	    	 System.out.println("The netsalary is : "+netsalary);
	    }
	    else
	    {
	    	result=(salary*15)/100;
	    	netsalary=result+salary;
	    	System.out.println("The netsalary is : "+netsalary);
	
	    }
	}
	
}
