package practicprograms;

public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i, p=1000f, r=0.2f, t=10000.0f;
		System.out.println("The principal starting amount is="+p);
		System.out.println("The interest rate per years is="+r);
		System.out.println("The time money is invested="+t);

		i=p*r*t;
		System.out.println("The simple interest is="+i);
	}

}
