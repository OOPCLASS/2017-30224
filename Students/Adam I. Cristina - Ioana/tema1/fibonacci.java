package tema1;

public class fibonacci {
	public static int fibo(int n) {
		if(n==0) return 0;
		else if (n==1) return 1;
		else return fibo(n-2)+fibo(n-1);
		
	}
	public static void main(String[] args) {
		int s, n;
		n=0;
		s=0;
		while(fibo(n)<4000000) {
			n++;
			fibo(n);
			if(fibo(n) % 2 == 0) {
				s=s+fibo(n); 
					
			}
		}
		System.out.println(s);
	}
}
