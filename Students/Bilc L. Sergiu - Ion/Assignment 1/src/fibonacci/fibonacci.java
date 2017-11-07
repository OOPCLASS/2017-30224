package fibonacci;

public class fibonacci {
	
	static void fibIterative(int n) {
		int evenSum=0;
		int a=0,b=1;
		while(a<n) {
			a=a+b;
			b=a-b;
			if(a%2==0)
				evenSum=evenSum+a;
		}
		System.out.println(evenSum);
	}


	public static void main(String[] args) {
		
		fibIterative(4000000);
		
		

	}

}
