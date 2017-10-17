package problema1;
import java.util.Scanner;

public class SumOfMultiples
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int count;
		long sum1 = 0, sum2 = 0, sum = 0;
		System.out.println("Introduceti un numar: ");
		int number = in.nextInt();
		for (count = 3; count < number; count = count+3)
		{
			sum1+=count;
		}
		for (count = 5; count < number; count = count+5)
		{
			sum2+=count;
		}
			sum = sum1 + sum2;
			System.out.println("Sum of multiples is: " +sum);
	}
}

