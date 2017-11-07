
public class LargestPalindrome 
{

	public static boolean isPalindrome(int number)
	{
		int copy = number;
		int reflected = 0;
		int lastDigit;
		while(number>0)
		{
			lastDigit = number % 10;
			reflected = reflected * 10 + lastDigit;
			number = number / 10;
		}
		if(reflected == copy)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		int i,j,ok=0;
		for(i=999;i>=100 && ok==0;i--)
			for(j=999;j>=100;j--)
			{
				if(isPalindrome(i*j) == true)
				{
					System.out.println(i*j);
					ok=1;
				}
			}
	}

}
