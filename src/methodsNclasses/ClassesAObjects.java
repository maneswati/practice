package methodsNclasses;
import java.util.Scanner;
public class ClassesAObjects {
	
	int num1, num2, result;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		num1=sc.nextInt();	

		System.out.println("Enter the second number : ");
		num2=sc.nextInt();	

		addition();
	}
	
	void addition()
	{
		result=num1+num2;
		System.out.println("The addition is : "+result);
	}
}