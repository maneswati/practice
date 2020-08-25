package practicprograms;
import java.util.Scanner;

public class Differentloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Differentloop l=new Differentloop();
		l.forloop();
		l.whileloop();
		l.dowhileloop();
	}
	
	public void forloop() {
		int i=0;
	
		
		for(i=0;i<=10;i++)
		{
			int r=i;
			System.out.println(" "+r);
			
		}
	}
	
	public void whileloop()
	{
		int n,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number = ");
		n=sc.nextInt();
		while(n>=i)
		{
			int r=i;
			System.out.println(""+r);
			i++;
		}
	}
	
	public void dowhileloop()
	{
		int n,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number = ");
		n=sc.nextInt();
		do
		{
			int r=i;
			System.out.println(""+r);
			i++;
		}
		while(n>=i);
	}

}
