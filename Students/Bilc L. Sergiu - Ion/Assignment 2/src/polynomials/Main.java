package polynomials;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		//Variabila folosita la operatiile EVAL si MUL_SCAL
		int n;
		
		//Cele doua polinoame
		Polynomial pol1=new Polynomial();
		Polynomial pol2=new Polynomial();
		//Polinomul folosit pentru calcularea operatiilor
		Polynomial polResult=new Polynomial();
		
		//operation - folosit la afisarea polinoamelor
		InputOutput operation=new InputOutput();
		//op - folosit la apelarea operatiilor
		Functions op=new Functions();
		
		//Citire din fisier
		FileReader fileReader = new FileReader("pol.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//Afisare in fisier
		FileOutputStream fOut=new FileOutputStream("output.txt");
		PrintStream ps=new PrintStream(fOut);
		
		//Citirea din fisier a celor doua polinoame
		operation.readPolynomial(pol1,bufferedReader);
		operation.readPolynomial(pol2,bufferedReader);
			
		//Afisarea in fisier al polinoamelor
		ps.print("Primul polinom este: ");
		operation.writePolynomial(pol1, ps);
		ps.println();
			
		ps.print("Al doilea polinom este: ");
		operation.writePolynomial(pol2, ps);
		ps.println();
			
		//Citirea din fisier a operatiilor
		String s;
		while ((s = bufferedReader.readLine()) != null){
			//Separarea numerelor operatiilor de restul liniei(daca este cazul)
			StringTokenizer st=new StringTokenizer(s);
			//op1 o sa continua numele operatiilor
		    String op1=st.nextToken( );
		    switch(op1) {
				case ("ADD"):
			   	    ps.print("Polinomul rezultat din adunarea primelor doua este: ");
				    //Operatia de adunare. polResult o sa contina rezultatul
			   	    op.add(pol1,pol2,polResult);
			   	    //Afisarea polinomului polResult in fisierul "output.txt" 
			   	    operation.writePolynomial(polResult, ps);
			   	    //Resetarea polinomului polResult pentru al putea folosii in la urmatoarele operatii
			   	    polResult.reset();
		       	    ps.println();
		       	    break;
		        case ("SUBTRACT"):
		        	ps.print("Polinomul rezultat din scaderea primelor doua este: ");
			       	op.substract(pol1,pol2,polResult);
			       	operation.writePolynomial(polResult, ps);
			       	polResult.reset();
			       	ps.println();
			       	break;
			    case ("MULTIPLY"):
			       	ps.print("Polinomul rezultat din inmultirea primelor doua este: ");
			       	op.multiply(pol1, pol2,polResult);
			       	operation.writePolynomial(polResult,ps);
			       	polResult.reset();
		        	ps.println();
		        	break;
			    case ("MUL_SCAL"):
			        n=Integer.parseInt(st.nextToken( ));
			       	ps.print("Polinomul rezultat din inmultirea primului polinom cu "+n+" este: ");
			       	op.multiplyScal(pol1,n,polResult);
			       	operation.writePolynomial(polResult,ps);
			       	polResult.reset();
			       	ps.println();
			       	
			       	ps.print("Polinomul rezultat din inmultirea celui de-al doilea polinom cu "+n+" este: ");
			       	op.multiplyScal(pol2, n,polResult);
		        	operation.writePolynomial(polResult,ps);
		        	polResult.reset();
		        	ps.println();
		        	break;
			    case ("EVAL"):
			       	n=Integer.parseInt(st.nextToken( ));
			       	ps.print("Evaluarea primului polinom in "+n+" este: ");
			       	ps.println(op.eval(pol1, n));
			       	ps.print("Evaluarea al doilea polinom in "+n+" este: ");
		        	ps.println(op.eval(pol2, n));
		        	break;
		        default:System.out.println("FInal!");
			        	
		        }	        		 
		         
	         }	
		fOut.close();
		ps.close();
		fileReader.close();
		bufferedReader.close();
	   
	}

}
