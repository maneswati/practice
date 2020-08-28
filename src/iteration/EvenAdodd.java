package iteration;
import java.util.Scanner;
public class EvenAdodd {

	public static void main(String[] args) {

		int num1, num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number display From :");
		num1=sc.nextInt();
		System.out.println("Enter the number display To :");
		num2=sc.nextInt();
	
		for(int i=num1;i<=num2;i++)
		{
			if(i%2==0)
				{
					System.out.println("The number is Even"+i);
				}
		}
		
		for(int i=num1;i<=num2;i++)
		{
			if(i%2!=0)
				{
					System.out.println("The number is odd"+i);
				}
		}
		
	}

}
