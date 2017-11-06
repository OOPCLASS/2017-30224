package polynomials;

import java.io.*;
import java.util.StringTokenizer;

public class InputOutput {

	//Citirea polinomului pol din fisier, fisierul sursa este stabilit in Main si este accesat prin bufferedReader
	public void readPolynomial(Polynomial pol,BufferedReader bufferedReader) {
		
		
		try {
	         String s;
	         //citirea unei linii din fisier
	         s = bufferedReader.readLine();
	         //separea coeficientilor polinomului
	         StringTokenizer st=new StringTokenizer(s);
	         while(st.hasMoreTokens()) {
	        	 //coefficientString o sa continua un coeficient al polinomului
	        	 String coefficientString=st.nextToken( );
	        	 //Transformam coefficientString in Integer pentru a putea crea polinomul
	        	 int coefficient=Integer.parseInt(coefficientString);
	        	 //Adaugarea coefficientului la polinom
	        	 pol.createPolynomial(coefficient);	 
	         }
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	         
	        
	     
	}
	
	//Scrierea polinomului in fisier, fisierul destinatie este stabilit in main si poate fi accesat prin ps
	public void writePolynomial(Polynomial pol,PrintStream ps) throws IOException {
		//variabila care o sa contina gradul polinomului
		int degree;
		//Variabila de verificare in caz ca polinomul este nul
		int ok=0;
		//Variabila care o sa contina puterea curenta a unui termen a polinomului
		int auxDegree;
		int i;
		
		degree=pol.getDegree();
		
		//Afisarea polinomului
		if(pol.coefficientPoly[0]!=0) {
			ps.print(pol.coefficientPoly[0]+"X^"+degree);
			ok=1;
		}
		
		auxDegree=degree;
		for( i=1;i<degree;i++) {
			auxDegree=auxDegree-1;
			if(pol.coefficientPoly[i]>0) {
				ps.print("+"+pol.coefficientPoly[i]+"X^"+auxDegree);
				ok=1;
			}else
				if(pol.coefficientPoly[i]<0) {
					ps.print(pol.coefficientPoly[i]+"X^"+auxDegree);
					ok=1;
				}
		}
			
		if(pol.coefficientPoly[i]>0) {
			ps.print("+"+pol.coefficientPoly[i]);
			ok=1;
		}else
			if(pol.coefficientPoly[i]<0) {
				ps.print(pol.coefficientPoly[i]);
				ok=1;
			}
		
		//Cazul in care polinomul este gol
		if(ok==0)
			ps.print('0');
			
	}

}
