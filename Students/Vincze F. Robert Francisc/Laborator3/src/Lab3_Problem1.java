import java.util.Scanner;

/* This program calculates the sum of multiples of 3 or 5, which are below N*/

public class Lab3_Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number:");
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		System.out.println("The result is "+sumOfAllMultiplesOf3Or5BelowN(N));
		

	}
	
	public static int sumOfAllMultiplesOf3Or5BelowN(int N)
	{
		int i;
		int sum=0;
		
		for(i=1; i<N; i++)
		{
			if((i%3==0) || (i%5==0))
			{
				sum+=i;
			}
		}
		
		return sum;
		
	}

}
