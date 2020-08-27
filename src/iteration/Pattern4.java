package iteration;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


		for(int row=1;row<=5;row++) {
			
			for(int col=row;col<=5;col++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		

		for(int row=4;row>=1;row--) {
			
			for(int col=row;col<=5;col++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
