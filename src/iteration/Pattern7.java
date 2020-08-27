package iteration;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<5; i++) //outer loop for number of rows(n) 
		{ for (int j=5-i; j>1; j--) //inner loop for spaces
    { 
        System.out.print(" "); //print space
    }  
    for (int j=0; j<=i; j++ ) //inner loop for number of columns
    { 
        System.out.print(""+j); //print star
    } 

    System.out.println(); //ending line after each row
} 


	}

}
