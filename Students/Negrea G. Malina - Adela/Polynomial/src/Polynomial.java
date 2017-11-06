import java.io.PrintWriter;

public class Polynomial {

	int[] coefficients;

	public Polynomial() {
		
	}
	
	public Polynomial(int n) {
		if(n>0)
			coefficients = new int[n];
	}
	public Polynomial(int n,int[] coefficients) {
		
		if(n>0) {
		this.coefficients = new int[n];
		this.coefficients = coefficients;
		System.arraycopy(coefficients, 0 ,this.coefficients, 0 ,n);
		}
		
	}
	

	
	public void display(PrintWriter pw) {
		
		int n;
		pw.println(coefficients[0]+ "x^"+ coefficients.length);
		for(int i=1; i<coefficients.length; i++) 
			if(coefficients[i] != 0) {
				n=coefficients.length-i;
				pw.println(" +" + coefficients[i] + "x^"+ n );
			}
	}
}
