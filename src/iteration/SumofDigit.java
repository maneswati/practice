package iteration;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		int num,  mod, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter any number : ");
		mod=sc.nextInt();

		
		while(mod>0)
		{
			num=mod%10;
			sum=sum+num;
			mod=mod/10;
		}
		System.out.println(""+sum);
		

	}
}


