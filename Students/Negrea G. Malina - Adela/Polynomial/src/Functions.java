
public class Functions {
	
	public static Polynomial add(Polynomial p1, Polynomial p2) {
		Polynomial p3= new Polynomial();
		
		if(p1.coefficients.length>p2.coefficients.length) {
			p3.coefficients = new int[p1.coefficients.length];
		}
		else {
			p3.coefficients = new int[p2.coefficients.length];
		}
		
		for(int i=0 ; i<p3.coefficients.length; i++) {
			if(i<p1.coefficients.length)
				if(i<p2.coefficients.length)
					p3.coefficients[i]=p1.coefficients[i]+p2.coefficients[i];
				else
					p3.coefficients[i]=p1.coefficients[i];
			else
				p3.coefficients[i]=p2.coefficients[i];
		}
		
		return p3;
		
	}
	
	public static Polynomial substract(Polynomial p1, Polynomial p2) {
		Polynomial p3= new Polynomial();
		
		if(p1.coefficients.length>p2.coefficients.length) {
			p3.coefficients = new int[p1.coefficients.length];
		}
		else {
			p3.coefficients = new int[p2.coefficients.length];
		}
		
		for(int i=0 ; i<p3.coefficients.length; i++) {
			if(i<p1.coefficients.length)
				if(i<p2.coefficients.length)
					p3.coefficients[i]=p1.coefficients[i]-p2.coefficients[i];
				else
					p3.coefficients[i]=p1.coefficients[i];
			else
				p3.coefficients[i]=-p2.coefficients[i];
		}
		
		return p3;
		
	}
	
	public static int eval(Polynomial p,int x){
		int val = p.coefficients[p.coefficients.length-1];
		int pow = 1;
		
		for(int i= p.coefficients.length-2; i>0; i--) {
			pow *= x;
			val += (pow*p.coefficients[i]);	
		}
		return val;
		
	}
	
	public static Polynomial multiply(Polynomial p1, Polynomial p2) {
		Polynomial p3= new Polynomial(p1.coefficients.length+p2.coefficients.length-1);
		
		for(int i=0 ; i<p1.coefficients.length; i++)
			for(int j=0; j<p2.coefficients.length; j++)
				p3.coefficients[i+j]=p1.coefficients[i]+p2.coefficients[j];
		
		
		return p3;
		
	}
	
	public static Polynomial mul_scal(Polynomial p1,int scal) {
		Polynomial p2= new Polynomial(p1.coefficients.length);
		for(int i=0; i<p1.coefficients.length ; i++) {
			p1.coefficients[i]*=scal;
		}
		return p2;
			

		
	}
	

}
