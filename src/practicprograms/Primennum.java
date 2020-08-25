package practicprograms;
import java.util.Scanner;

public class Primennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, i, m=0, f=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		m=num/2;
		
			
		
		for(i=2;i<=m;i++)
		{
			if(num%i==0)
			{
				System.out.println(" number is not a prime");
				f=1;
				break;
			}
			}
			if(f==0)
			{
				System.out.println("number is prime");
				
			}
		
		
	}

}
