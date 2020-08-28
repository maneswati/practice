package methodsNclasses;

import java.util.Scanner;

public class AdditionDemo {

		

	int  num1, num2;   //instance variable
	static int result; // static variable
	void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		num1=sc.nextInt();	

		System.out.println("Enter the second number : ");
		num2=sc.nextInt();	
		
		addition(num1,num2);
		substraction(num1,num2);
		multiply(num1,num2);
		division(num1,num2);
	}
	
	void addition(int num1, int num2)//local variable
	{ 
		 
	
		result=num1+num2;
		System.out.println("The addition is : "+result);
		
	}
	
	void substraction(int num1, int num2)
	{
		result=num1-num2;
		System.out.println("The substraction  is : "+result);
		
	}
	void multiply(int num1, int num2)
	{
		result=num1*num2;
		System.out.println("The multiplicatin is : "+result);
		
	}
	void division(int num1, int num2)
	{
		result=num1/num2;
		System.out.println("The division is : "+result);
		
	}
}