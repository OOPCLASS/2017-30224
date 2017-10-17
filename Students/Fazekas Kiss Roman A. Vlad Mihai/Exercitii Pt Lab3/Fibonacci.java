package pb1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i=1;
		while(fib(i)<4000000){
			if (fib(i)%2==0){
				sum=sum+fib(i);
			}
			i++;
		}
		System.out.println(sum);
	}
	    public static int fib(int n) {
	        if (n <= 1) return n;
	        else return fib(n-1) + fib(n-2);
	    }
}
