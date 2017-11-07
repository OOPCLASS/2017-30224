import java.util.Scanner;

public class InputOutput {
	
	public void readPolynomial(Polynomial pol){
		int i;
		int number;
		
		System.out.println("Introduceti numarul de termeni ai polinomului");
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		System.out.println("Introduceti cei "+n+" termeni ai polinomului");
		
		for (i=0; i<n; i++){
			number = in.nextInt();
			pol.createPolynamial(number);
		}
	}
	
	public void writePolynomial(Polynomial pol){
		int degree;
		int i, ok=0;
		int aux;
		
		degree=pol.getDeegree();
		if (pol.coefficientPolynamial[0]!=0){
			System.out.print(pol.coefficientPolynamial[0]+"X^"+degree);
			ok=1;
		}
		for (i=1; i<degree; i++){
			aux=degree-i;
			if (pol.coefficientPolynamial[i]>0){
				System.out.print("+"+pol.coefficientPolynamial[i]+"X^"+aux);
				ok=1;
			}	
			else 
				if (pol.coefficientPolynamial[i]<0){
					System.out.print(pol.coefficientPolynamial[i]+"X^"+aux);
					ok=1;
				}
				
		}
		if (pol.coefficientPolynamial[i]>0){
			System.out.print("+"+pol.coefficientPolynamial[degree]);
			ok=1;
		}
		else 
			if (pol.coefficientPolynamial[i]<0){
				System.out.print(pol.coefficientPolynamial[degree]);
				ok=1;
			}
		if (ok==0)
			System.out.print('0');
		System.out.println();
	}
	
	public void writePolynomialFloat(PolynomialFloat pol){
		int degree;
		int i, ok=0;
		int aux;
		
		degree=pol.getDeegree();
		if (pol.coefficientPolynamial[0]!=0){
			System.out.print(pol.coefficientPolynamial[0]+"X^"+degree);
			ok=1;
		}
		for (i=1; i<degree; i++){
			aux=degree-i;
			if (pol.coefficientPolynamial[i]>0){
				System.out.print("+"+pol.coefficientPolynamial[i]+"X^"+aux);
				ok=1;
			}	
			else 
				if (pol.coefficientPolynamial[i]<0){
					System.out.print(pol.coefficientPolynamial[i]+"X^"+aux);
					ok=1;
				}
				
		}
		if (pol.coefficientPolynamial[i]>0){
			System.out.print("+"+pol.coefficientPolynamial[degree]);
			ok=1;
		}
		else 
			if (pol.coefficientPolynamial[i]<0){
				System.out.print(pol.coefficientPolynamial[degree]);
				ok=1;
			}
		if (ok==0)
			System.out.print('0');
		System.out.println();
	}
}
