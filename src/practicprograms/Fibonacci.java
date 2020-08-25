package practicprograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3,count,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number1 = ");
		n1=sc.nextInt();
		
	

		System.out.println("Enter the value of number2 = ");
		n2=sc.nextInt();

	//	System.out.println("Enter the value of number3 = ");
		//n3=sc.nextInt();

		System.out.println("Enter the value of count = ");
		count=sc.nextInt();
		
		System.out.println(n1+" "+n2);

		for(i=2;i<count;++i)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;

			System.out.println("The Fibonacci series is = "+n3);
			
		}
		
		
	}

}
