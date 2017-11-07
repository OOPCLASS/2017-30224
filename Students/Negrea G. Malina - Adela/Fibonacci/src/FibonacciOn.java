
public class FibonacciOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] fib = new int[10000];
		int i = 1;
		int sum = 0;
		
		fib[0]=0;
		fib[1]=1;
		
		
		do {
			i++;
			fib[i]=fib[i-1]+fib[i-2];
			if(fib[i]%2 == 0)
				sum += fib[i];

		}while(fib[i]<4000000);
			
		
		System.out.println("Suma termenilor: :" + sum);
		
	}

}
