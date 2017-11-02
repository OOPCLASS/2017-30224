import java.util.Scanner;

public class SumaPare {

	public static void main(String[] args) {
	
		Scanner citire = new Scanner(System.in);
		int n = citire.nextInt();
		
		int suma=0,i;
		
		for(i =1;i<=n;i++ )
			if(fibonacci(i)%2==0)
				suma+=fibonacci(i);
		
		System.out.println(suma);
		

	}
	public static int fibonacci(int n) {
		
		if(n<=1)
			return n;
		return fibonacci(n-1) + fibonacci(n-2); 
	}
}
