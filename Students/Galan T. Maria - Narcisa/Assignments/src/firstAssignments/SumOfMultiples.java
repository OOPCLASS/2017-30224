package firstAssignments;

import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		
		int sum=0;
		int multiple=3;
		
		System.out.print("Introduce the limit:");
		Scanner in=new Scanner(System.in);
		int limit=in.nextInt();
		
		for(;multiple<limit;multiple++) {
			if(multiple%3==0 || multiple%5==0)
				sum=sum+multiple;
		}
		
		System.out.println("Sum Of Multiples is: "+sum);
	}
}
