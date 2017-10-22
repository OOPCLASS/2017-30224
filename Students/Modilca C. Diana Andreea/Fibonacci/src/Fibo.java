public class Fibo
{

	public static void main(String[] args) 
	{
		int a=1, b=2, c=3;
		int sumOfEvenTerms=0;
		while(c<100)
		{
			if(c<100)
			{
				c=a+b;
				a=b;
				b=c;
				if(c%2==0)
					{
						sumOfEvenTerms+=c;	
						System.out.println(c + " ");
					}
			}
		}
		System.out.println("Suma termenilor pari din sirul Fibo este: " + sumOfEvenTerms);
	}

}
