package methodsNclasses;
import java.util.Scanner;
public class Student {

	int rollNo, totalMarks;
	String name, contactNo;
	
	Scanner sc=new Scanner(System.in);
	
	void input()
	{
	System.out.println("Enter Student Name : ");
	name=sc.next();
	
	System.out.println("Enter Student RollNo : ");
	rollNo=sc.nextInt();
	
	System.out.println("Enter Student ContactNo : ");
	contactNo=sc.next();
	
	System.out.println("Enter Student Total marks : ");
	totalMarks=sc.nextInt();
	
	}
	
	void display()
	{
		System.out.println("Student Name : "+name);
		
		System.out.println("Student Name : "+rollNo);
		
		System.out.println("Student Name : "+contactNo);
		
		System.out.println("Student Name : "+totalMarks);

	}
}
