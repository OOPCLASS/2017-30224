package firstAssignments;

public class Palindrome {
	
	static int verifyPalindrom(int number) {
		
		int reverse=0,aux=number;
		while(number!=0) {
			reverse=number%10+reverse*10;
			number/=10;
		}
		if(aux==reverse)
			return 1;
		else
			return 0;
	}
	
	static int largestPalindrom() {
		
		int largestP=0;
		for(int i=999;i>100;i--)
			for(int j=999;j>100;j--) {
				if((verifyPalindrom(i*j)==1) && (i*j>largestP))
					largestP=i*j;
			}
			return largestP;
	}
	
	public static void main(String[] args) {
		System.out.print("The  largest palindrom is:"+largestPalindrom());

}

}
