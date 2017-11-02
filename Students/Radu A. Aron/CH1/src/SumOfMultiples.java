import java.util.Scanner;


// doar pentru numere prime intre ele

public class SumOfMultiples 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Primul numar : ");
		long firstNumber = in.nextInt();
		System.out.print("Al doilea numar : ");
		long secondNumber = in.nextInt();
		System.out.print("Multiplii mai mici decat : ");
		long limit = in.nextInt();
		
		long sumIs = SumOfMultiplesOfANumber(firstNumber, limit) + SumOfMultiplesOfANumber(secondNumber, limit)
		              - SumOfMultiplesOfANumber(firstNumber * secondNumber, limit);
		
		System.out.print("Suma multiplilor este : " + sumIs);
	}
	
	public static long SumOfMultiplesOfANumber(long number, long smallerThan)
	{
		long n = smallerThan / number;
		
		return n * (n+1) / 2 *number;
	}

}
