/* This program calculates the heighest palindrom number formed by the product of two
 * 3 digit numbers.
 */

public class Lab3_Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber, secondNumber, largestPalindrome=0, product;
		
		for(firstNumber=100; firstNumber<1000; firstNumber++)
		{
			for(secondNumber=100; secondNumber<1000; secondNumber++)
			{
				product=firstNumber*secondNumber;
				if(isPalindrome(product)==1)
				{ 
					if(product>largestPalindrome)
					{
					largestPalindrome=product;
					}
				}
			}
		}
		
		System.out.println("Largest palindrom made from product of two 3-digit numbers is "+largestPalindrome);
		
	}
	
	public static int isPalindrome(int originalNumber)
	{
		int reversedNumber=0, tempNumber=originalNumber;
		
		while(tempNumber>0)
		{
			reversedNumber=reversedNumber*10+tempNumber%10;
			tempNumber/=10;
		}
		
		if(reversedNumber==originalNumber)
		return 1;
		
		return 0;
	}

}
