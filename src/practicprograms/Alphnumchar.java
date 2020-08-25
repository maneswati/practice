package practicprograms;
import java.util.Scanner;
public class Alphnumchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the any type value : ");
		ch=s.next().charAt(0);
		
		if(ch>=65 && ch<=122)
		{
			System.out.println("The character is alphabet ");
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("The character is number ");
		}
		else
		{
		
				System.out.println("The character is special symbol ");
			
			
		}
		
		}

}
