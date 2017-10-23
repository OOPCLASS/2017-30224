package palindrome;

public class palindrome {

	static int isPalindrom(int n) {
		int aux=0,aux2=n;
		while(n!=0) {
			aux=n%10+aux*10;
			n/=10;
		}
		if(aux2==aux)
			return 1;
		else
			return 0;
	}
	
	static int largestPalindrom() {
		
		int max=0;
		for(int i=999;i>100;i--)
			for(int j=999;j>100;j--) {
				if((isPalindrom(i*j)==1) && (i*j>max))
					max=i*j;
			}
			return max;
	}
	
	public static void main(String[] args) {
		System.out.println(largestPalindrom());

	}

}
