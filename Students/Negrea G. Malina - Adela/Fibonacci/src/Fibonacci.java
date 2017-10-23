
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long sum = 0;
		int i = 2;
		int f;
		
		do {
			f= fibonacii(i);
			if(f%2 == 0)
				sum +=f;
			i++;
			System.out.println(f + " ");
			
		}
		while(f< 4000000);
		
		System.out.println("Suma termenilor este: " + sum);
		
		

	}
	
	public static int fibonacii(int nr) {
		if(nr<= 1)
			return nr;
		return fibonacii(nr-1)+fibonacii(nr-2);		
	}

}
