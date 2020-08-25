package practicprograms;

import java.util.Scanner;

public class Upperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the any type value : ");
		ch=s.next().charAt(0);
		
		if(ch>=65 && ch<=90)
		{
			System.out.println("The character is Upper case alphabet ");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("The character is Lower case alphabet ");
		}
		else
		{
		
				System.out.println("The character is not a letter ");
			
			
		}
		
	}

}
