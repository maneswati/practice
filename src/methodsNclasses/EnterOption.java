package methodsNclasses;
import java.util.Scanner;
public class EnterOption {
	public static void main(String[] args) {
		double num1,num2,result = 0;
		char num=0;
		Scanner sca=new Scanner(System.in);
		do
		{
		System.out.println("WELCOME");
		
		
		System.out.println("Enter Option:\n a) Addition\n b)Substraction\n c) Multiplication\n d)Division\n e)Exit");
		 num=sca.next().charAt(0);
	
		switch(num)
		{
		
		case 'a' :
			System.out.println("Enter value of num1 : ");
			num1=sca.nextDouble();

			System.out.println("Enter value of num2 : ");
			num2=sca.nextDouble();

			result=num1+num2;
			break;
			
		case 'b' :
			System.out.println("Enter value of num1 : ");
			num1=sca.nextDouble();

			System.out.println("Enter value of num2 : ");
			num2=sca.nextDouble();

			result=num1-num2;
			break;
			
		case 'c' :
			System.out.println("Enter value of num1 : ");
			num1=sca.nextDouble();

			System.out.println("Enter value of num2 : ");
			num2=sca.nextDouble();

			result=num1*num2;
			break;
			
		case 'd' :
			System.out.println("Enter value of num1 : ");
			num1=sca.nextDouble();

			System.out.println("Enter value of num2 : ");
			num2=sca.nextDouble();

			result=num1/num2;
			break;
			
		case 'e' :
			//System.out.println();
			//System.console().wait();
			//System.out.flush();
			Runtime.getRuntime().exit(0);
			break;
		
			default:
				System.out.println("incorrect");
				return;
			
		}
		System.out.println("result : "+result);
		}
		while(num!=0);
	}
	}
