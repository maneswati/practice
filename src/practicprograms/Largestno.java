package practicprograms;
import java.util.Scanner;

public class Largestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number1 = ");
		n1=sc.nextInt();
		
		System.out.println("Enter the value of number2 = ");
		n2=sc.nextInt();

		System.out.println("Enter the value of number3 = ");
		n3=sc.nextInt();
		
		
		if(n1>n2 && n2>n3)
		{
			System.out.println("The number is largest number" +n1);
		}
		

		else if(n2>n1 && n1>n3)
		{
			System.out.println("The number is largest number" +n2);
		}
		

		if(n3>n1 && n1>n2)
		{
			System.out.println("The number is largest number" +n3);
		}
	}
	

}
