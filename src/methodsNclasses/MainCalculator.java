package methodsNclasses;
import java.util.Scanner;
public class MainCalculator {

	public static void main(String[] args) {
		
		double num1,num2;
		char num=0;
		Scanner sc=new Scanner(System.in);
		
		Calculator obj=new Calculator();

		System.out.println("ENter the first number : ");
		num1=sc.nextDouble();
		
		System.out.println("ENter the Second number : ");
		num2=sc.nextDouble();
		
		double result=obj.addition(num1,num2);
		double result1=obj.substraction(num1,num2);
		double result2 =obj.multiplication(num1,num2);
		double result3=obj.division(num1,num2);

		do {

		System.out.println("Enter any option\n a) Addition\n b) Substraction\n c) Multiplication\n d) Division\n");
		num=sc.next().charAt(0);
		
			switch(num)
				{
				case 'a' :
					
					System.out.println("Additinon is :"+result);
		
					break;
		
				case 'b' :
					
					System.out.println("Substraction is :"+result1);
					break;
		
		
				case 'c' :
							
					System.out.println("Multiplication is :"+result2);
					
					break;
		
		
				case 'd' :
					System.out.println("Division is :"+result3);
		
					break;
				default:
						System.out.println("Incorrect Option");
				break;
				}
		}
		while(num!=0);				

	}
	}


