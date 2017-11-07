import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, ok=0;
		
		Polynomial pol1 = new Polynomial();
		Polynomial pol2 = new Polynomial();
		Function comm = new Function();
		RootFunction commRoot = new RootFunction();

		InputOutput operation = new InputOutput();
		
		operation.readPolynomial(pol1);
		operation.writePolynomial(pol1);
		operation.readPolynomial(pol2);
		operation.writePolynomial(pol2);
		
		System.out.println("Introduceti operatii. Operatia EXIT este pentru a inchide");
		while (ok==0){
			Scanner in = new Scanner(System.in);
			String command=in.nextLine();
			switch (command){
				case ("ADD"): comm.add(pol1, pol2); break;
				case ("SUBSTRACT"): comm.substract(pol1, pol2); break;
				case ("MULTIPLY"): comm.multiply(pol1, pol2); break;
				case ("MUL_SCAL"): 
					n=in.nextInt();
					comm.mul_scal(pol1, n);
					comm.mul_scal(pol2, n);
					break;
				case ("EVAL"): 
					n=in.nextInt();
					System.out.println(comm.eval(pol1, n));
					System.out.println(comm.eval(pol2, n));
					break;
				case ("EXIT"): ok=1; break;
				case ("DIVISION"): comm.division(pol1, pol2); break;
				case ("ROOT"): 
					System.out.println(commRoot.root(pol1));
					System.out.println(commRoot.root(pol2));
					break;
				default: System.out.println("Operatiune neidentificata");
			}
		}
	}

}
