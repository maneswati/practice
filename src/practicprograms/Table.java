package practicprograms;
import java.util.Scanner;


public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int row, col,n;
		    System.out.println("Enter an integer to print it's multiplication table");
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    System.out.println("Multiplication table of " + n);
		    int b=in.nextInt();
		    
		    for (col=1; col <= 10; col++)
		    {
		    	
		       // System.out.println("Multiplication table of "+col);

		        for (row= 1; row <10; row++)
		        {
		          System.out.print(" "+(col*row));
		        }
		        
		        System.out.println(" "+(col*row));
		   
	}
		    
	}
	
	
	}
