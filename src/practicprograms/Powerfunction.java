package practicprograms;
import java.util.Scanner;

public class Powerfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num,power;
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the value of number = ");
		num=sc.nextInt();
		
		System.out.println("Enter the value of power = ");
		power=sc.nextInt();
		
		double r=Math.pow(num, power);
		System.out.println("The entered number power is = "+r);
	}

}
