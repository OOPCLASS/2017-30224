package firstAssignments;

public class FibonacciEvenSum {
	
	public static void main(String[] args) {
		
		int sumOfEvenTerms=0;
		int term1=0,term2=1;
		
		while(term1<4000000) {
			
			term1+=term2;
			term2=term1-term2;
			
			if(term1%2==0)
				sumOfEvenTerms+=term1;
		}
		System.out.println("The sum of the even-valued terms is:"+sumOfEvenTerms);
		
	}
	
}


