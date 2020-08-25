package practicprograms;

import java.util.Scanner;

public class Triangleis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of side1 : ");
		a=sc.nextInt();
		System.out.println("Enter the value of side2 : ");
		b=sc.nextInt();
		System.out.println("Enter the value of side3 : ");
		c=sc.nextInt();
		
		if(a==b && b==c && a==c)
		{
			System.out.println("The triangle is equilateral : ");
		}
		else if(a==b)
		{
			System.out.println("The triangle is isoscelees: ");
		}
		else
		{
			System.out.println("The triangle is scalene ");
		}
	}

}
