package SumOfMultiples;

import java.util.Scanner;

public class SumOfMultiples {

	
	public static void main(String[] args) {
		int sum=0;
		int number=3;
		Scanner in=new Scanner(System.in);
		int finalNumber=in.nextInt();
		
		for(;number<finalNumber;number++) {
			if(number%3==0 || number%5==0)
				sum=sum+number;
		}
		
		System.out.println("Suma finala este: "+sum);
		
	}

}
