
public class Main {

	public static void main(String[] args) {
		int[] p = new int[100];
		int k=0;
		
		InputOutput.read(p,k);
		Polynomial p1= new Polynomial(k-1,p);
		
		for(int i=0;i<k;i++)
			p[i]=0;
		k=0;
		InputOutput.read(p,k);
		Polynomial p2= new Polynomial(k-1,p);
		
		String line = new String();
		
		
		
		do {
			InputOutput.read(line);
			if(line.compareTo("ADD")==0) {
				Polynomial p3 = new Polynomial(p1.coefficients.length);
				p3 = Functions.add(p1,p2);
				InputOutput.write(p3.coefficients);
			}
			else
				if(line.compareTo("SUBTARCT")==0) {
					Polynomial p3 = new Polynomial(p1.coefficients.length);
					p3 = Functions.substract(p1,p2);
					InputOutput.write(p3.coefficients);
				}
				else
					if(line.compareTo("MULTIPLY")==0) {
						Polynomial p3 = new Polynomial(p1.coefficients.length);
						p3 = Functions.multiply(p1,p2);
						InputOutput.write(p3.coefficients);
					}
					else
						if(line.startsWith("MUL_SCAL")) {
							Polynomial p3 = new Polynomial(p1.coefficients.length);
							p3 = Functions.mul_scal(p1,(int)line.charAt(line.length()-1));
							InputOutput.write(p3.coefficients);
						}
						else
							if(line.startsWith("EVAL")) {
								int val;
								val = Functions.eval(p1,(int)line.charAt(line.length()-1));
								InputOutput.write(val);
							}	
				
			
		}while(line!=null);
		
		
				

		

	}

}
