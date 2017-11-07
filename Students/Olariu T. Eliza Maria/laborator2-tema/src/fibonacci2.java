
public class fibonacci2 {
	
	public static int fibo(int n){
		
		int k;
		int auxk;
		int auxk1;
		
		
		if (n==0)
			return 0;
			else if (n<=2)
				return 1;
				else {
					//System.out.println(n);
					k=n/2;
					auxk=fibo(k);
					auxk1=fibo(k-1);
					if (n%2==0){
						k=n/2;
						auxk=fibo(k);
						auxk1=fibo(k-1);
						return ((2*auxk1+auxk)*auxk);
						}
					else{
						k=(n+1)/2;
						auxk=fibo(k);
						auxk1=fibo(k-1);
						return (auxk*auxk+auxk1*auxk1);
					}
				}
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=36;
		
		System.out.println(fibo(n)-2);
	}

}
