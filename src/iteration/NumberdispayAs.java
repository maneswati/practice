package iteration;


public class NumberdispayAs {

	public static void main(String[] args) {
		int a,n,d, count; 
		
		
		count=(999-33-(-1))/1;
		System.out.println("Total numbers is between 33 to 999 : "+count);
		
		count=(999-33-(-1))/3;
		System.out.println("The total number which is divided by 3 is : "+count);
		
		for(int i=33; i<=999; i++)
		{
			
			if(i%3==0)
				{
				
					System.out.println("PINK\n");
					
					//count=(33+(-999-1)*3);
					
					
				}
		}
		count=(999-33-(-1))/5;
		System.out.println("The total number which is divided by 3 is : "+count);
		
		for(int i=33; i<=999; i++)
		{
			if(i%5==0)
				{
					System.out.println("YELLOW \n ");
			
				}
		
		}
		
		count=(999-33-(-1))/(5*3);
		System.out.println("The total number which is divided by 3 is : "+count);
		
		for(int i=33; i<=999; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("PINK & YELLOW \n ");

			}
		}
		
	}
}
