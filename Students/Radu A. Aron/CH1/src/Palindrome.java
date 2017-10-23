
public class Palindrome 
{

	public static void main(String[] args) 
	{
		int i = 0, j = 0;
		boolean isPal = false;
		
		
		for (i = 999; i > 930; i--)
		{
			for (j = 999;j > 910; j--)
			{
				isPal = isPalindrome(i*j);
				
				if (isPal == true)
					break;
			}
			
			if (isPal == true)
				break;
		}
		
		System.out.print(i + " * " + j + " = " + (i*j));

	}
	
	public static boolean isPalindrome(int number)
	{
		int mirror = 0;
		int aux = number;
		
		while (number > 0)
		{
			mirror = mirror * 10 + number % 10;
			number /= 10;
		}
		
		if (aux == mirror)
			return true;
		else
			return false;	
	}

}
