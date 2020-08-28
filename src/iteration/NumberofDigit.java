package iteration;

import java.util.Scanner;

public class NumberofDigit {

	public static void main(String[] args) {
	
		int num,  count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter any number : ");
		num=sc.nextInt();
		do
		{
			//int count=0;
			
			num=num/10;
			count++;
		}
		
		while(num!=0);
		System.out.println(""+count);
	}

}
