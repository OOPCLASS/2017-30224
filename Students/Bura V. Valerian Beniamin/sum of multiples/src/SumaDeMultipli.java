import java.util.Scanner;

public class SumaDeMultipli {

	public static void main(String[] args) {
		Scanner citire = new Scanner(System.in);
		int numar = citire.nextInt();
		int indice, sumaMultipli=0;
		
		for(indice=numar; indice>=6;indice--)
			if(indice%3==0 || indice%5==0)
				sumaMultipli+=indice;
		
		sumaMultipli+=3+5;
		
		System.out.println(sumaMultipli);
		
		
		

	}

}
