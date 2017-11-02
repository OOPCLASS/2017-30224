package problema2;

public class FibonacciEvenSum 
{

	public static void main(String[] args) 
	{
		{
		    int number = 40;
		    int firstNumber, secondNumber = 0;
		    int sum = 0;
		    int numLim = 0;
		    firstNumber = 1;
		     
		    while(numLim < 4000000)
		    {
		    	secondNumber += firstNumber;
		    	firstNumber = secondNumber;
		        numLim = secondNumber;
		        if(numLim > 4000000)
		        {
		             break;
		        }
		        if(firstNumber % 2 == 0 && secondNumber % 2 ==0)
		        {   
		            sum = firstNumber + secondNumber;
		            System.out.println("Sum: " +sum);
		        }
		    }
		}
    }
}

	
	
	
	


