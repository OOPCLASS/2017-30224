import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		
		System.out.println("Introduceti numarul maxim ");
		
		Scanner in = new Scanner(System.in);
		int maxNr = in.nextInt();
		
		int sum = 0;
		
		for(int i=3; i<maxNr; i++) {
			if(i%3 == 0)
				sum = sum + i;
			else
				if(i%5 == 0)
					sum = sum + i;
		}
		
		System.out.println("Suma multiplioreste: " + sum);
		
		

	}

}
