
public class Fib {
	
	public static int fibonacci(int n) {
	 if (n<=1)
		 return n;
	 else 
		 return fibonacci(n-1)+ fibonacci(n-2);
		
		
		
	}

	public static void main(String[] args) {
		
		int i, sum=0, n=100;
		
		for (i=1;i<=n;i++)
			if (fibonacci(i)%2==0)
				sum=sum+fibonacci(i);
		
		System.out.println("Suma este: "+sum);
		
	}
}
	
	


