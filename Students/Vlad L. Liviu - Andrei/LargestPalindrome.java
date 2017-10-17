package problema3;

public class LargestPalindrome 
{

	public static void main(String[] args) 
	{
		int firstNumber, secondNumber;
		int countFirst, countSecond, reversedInteger = 0;
		int palindrome, remainder, originalInteger;
		for (firstNumber = 1; firstNumber <= 99; firstNumber++)
		
			for (secondNumber = 1; secondNumber <= 99; secondNumber++)
			{
				palindrome = firstNumber * secondNumber;
				System.out.println(palindrome);
				{
					originalInteger = palindrome;
				 while( palindrome != 0 )
				    {
				        remainder = palindrome % 10;
				        reversedInteger = reversedInteger*10 + remainder;
				        palindrome /= 10;
				    
				 if (originalInteger == reversedInteger)
				 {
					 System.out.println("Number is forming a palindrome: " +firstNumber);
					 System.out.println("Number is forming a palindrome: " +secondNumber);
				 }
				    }
				}
			}
		
	}	
}
