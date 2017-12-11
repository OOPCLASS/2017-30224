
public class main {

	public static void main(String[] args) {
		
		Complex c1=new Complex(2.5,7);
		
		System.out.println(c1.toString());
		
		Complex c2=new Complex(1,-2);
		
		System.out.println(c2.toString());
		
		System.out.println("Sum is "+c1.add(c2));
		System.out.println("Difference is "+c1.substract(c2));
		System.out.println("Multiplication is "+c1.multiply(c2));
		System.out.println("Division is "+c1.divide(c2));
		
		System.out.println("Argument of first number is " + c1.argument());
		System.out.println("Magnitude of second number is " + c2.magnitude());
       //etc....
	}

}
