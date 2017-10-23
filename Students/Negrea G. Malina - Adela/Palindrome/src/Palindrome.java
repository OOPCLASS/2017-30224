
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nr1 ;
		int nr2 ;
		int pal = 0;
		
		for(nr1= 999; nr1>=100; nr1--)
			for(nr2=nr1 ; nr2>=100; nr2--) {
				pal= nr1*nr2;
				if(palindrom(pal)==1) {
					System.out.println("Cel mai mare nr palindrom formati prin inm a 2 nr de 3 cifre este: "+pal + "\n");
					System.out.println("Numarul este format din " + nr1 + "*" +nr2);
					nr1 = nr2 = 99;
				}
			}
					

	}
	
	public static int palindrom(int nr) {
		
		int rev = 0 ;
		int aux = nr;
		
		
		while(aux!=0) {
			rev = rev*10 +aux%10;
			aux /= 10;
			
		}
			
		if(rev == nr)
			return 1;
		return 0;
	
		
	
	}

	

}
