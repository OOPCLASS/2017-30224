
public class SpiralWOMatrix 

{
	//problema modificata fara matrice

	public static void main(String[] args) 
	{
		float ratio = 1;
		int count = 1;
		int layer = 0;
		int primeNumbers = 0;
		int i = 0, j = 0;
		
		
		while (ratio > 0.1)
		{
			layer++;
			
			for (i = 0; i < 2 * layer; i++)
			{
				count++;
			}
			if (isPrime(count))
				primeNumbers++;
			
			for (i = 0; i < 2 * layer; i++)
			{
				count++;
			}
			if (isPrime(count))
				primeNumbers++;
			
			for (i = 0; i < 2 * layer; i++)
			{
				count++;
			}
			if (isPrime(count))
				primeNumbers++;
			
			for (i = 0; i < 2 * layer; i++)
			{
				count++;
			}
			if (isPrime(count))
				primeNumbers++;
			

			ratio = (float)primeNumbers / (layer * 4 + 1);
			//System.out.println(ratio);
		}
		
		System.out.print("E nevoide de o matrice de dimensiunea : " + (layer * 2 + 1)  + " pt ca procentul "
				+ "	sa fie mai mic decat 10%");
	}
	
	
	public static boolean isPrime(long number)
	{
		if (number <=  1)
			return false;
		else if (number % 2 == 0)	
			return false;
		else
		{
			long demp = 3;
			boolean isntPrime = true;
			
			while ((isntPrime) && (demp <= Math.sqrt(number)))
			{
				if (number % demp == 0)
					isntPrime = false;
				else
					demp += 2;
			}
			
			return isntPrime;
		}
	}
	
}
	


