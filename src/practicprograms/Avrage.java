package practicprograms;

public class Avrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marathi=89, hindi=89, english=54, maths=93, sos=91, s=78, total, avg;
		
		System.out.println("The mark of marathi is="+marathi);
		System.out.println("The mark of hindi is="+hindi);
		System.out.println("The mark of english is="+english);
		System.out.println("The mark of maths is="+maths);
		System.out.println("The mark of social science is="+sos);
		System.out.println("The mark of science is="+s);
		
		total=marathi+hindi+english+sos+maths+s;
		
		System.out.println("The total marks is="+total);
		
		avg=(total*100)/600;
		System.out.println("The mark of avrage is="+avg);

	}

}
