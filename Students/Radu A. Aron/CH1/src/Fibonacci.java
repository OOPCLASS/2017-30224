
public class Fibonacci 
{
	
	//eficienta O(n)

	public static void main(String[] args) 
	{
		int fibN1 = 1, fibN2 = 2;
		int fibN;
		
		long sumOfEven = 2;
		
		while (fibN2 < 4000000)
		{
			fibN = fibN2;
			fibN2 = fibN2 + fibN1;
			fibN1 = fibN;
			
			if (fibN2 % 2 == 0)
				sumOfEven += fibN2;
		}
		
		System.out.println("Sum is : " + sumOfEven);
	}

}
