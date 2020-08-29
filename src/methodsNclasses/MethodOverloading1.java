package methodsNclasses;

import java.util.Scanner;

public class MethodOverloading1 {
	
	void input()
	{
		int length,  breadth, side;
		int height,base;
		//float a;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter value of height   : ");
		height=sc.nextInt();
		
		System.out.println("Enter value of base  : ");
		base=sc.nextInt();
		
		//System.out.println("Enter value of a 1/2 is : ");
		//	a=sc.nextFloat();
		area(height, base, 0.5f);

		
		System.out.println("Enter value of side  : ");
		side=sc.nextInt();
		
		area(side);
		
		System.out.println("Enter value of length  : ");
		length=sc.nextInt();
		
		System.out.println("Enter value of breadth  : ");
		breadth=sc.nextInt();
		
		area(length, breadth);
		
		
		
	}

		
	void area(int side)
	{
		int result=side*side;
		System.out.println("The area of square is : "+result);
		
	}
	void area(int length, int breadth)
	{
		int result=length*breadth;
		System.out.println("The area of rectangle is : "+result);
		
	}

	void area(int height, int base, float a)
	{
		
		int result= (int) ((a)*height*base);
		System.out.println("The area of triangle is : "+result);
		
	}

}
