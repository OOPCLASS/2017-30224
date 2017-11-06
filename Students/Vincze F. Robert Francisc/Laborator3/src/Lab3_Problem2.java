/*This programs calculates the sum of the  even terms of the Fibonacci sequence
 * whose values do not exceed four million. Algorithm runs in O(n) time.
 */

public class Lab3_Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int secondLastNumber = 1;
		int firstLastNumber= 2;
		int sum=0;
		int sumOfPairTerms=2;
	
		
		while(secondLastNumber+firstLastNumber<4000000)
		{
			sum=firstLastNumber+secondLastNumber;
			secondLastNumber=firstLastNumber;
			firstLastNumber=sum;
			
			if(sum % 2 == 0)
			{
				sumOfPairTerms=sumOfPairTerms+sum;
			}
		}
		
		System.out.println("Sum of pair terms of the Fibonacci sequence which do not exceed 4 million is "+sumOfPairTerms);
	}

}
