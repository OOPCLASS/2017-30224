
public class Pal {

	public static void main(String[] args) {
		int number1, number2 , max=0, i=0, j=0;
		for (number1=1; number1<1000; number1++)
			for(number2=1; number2<1000; number2++)
				if(palindrom(number1*number2)==1)
					if(number1*number2>=max) { 
						max=number1*number2;
						i=number1;
						j=number2;
					}
		
	
		
		System.out.println("cel mai mare palindrom dintre numerele " + i +" si " + j +" este: "+ max);
					

	}
	
	public static int palindrom(int n) {
		int ncopy=n;
		int cifra;
		int ogl=0;
		while(n>0) {
			cifra=n%10;
			ogl=ogl*10+cifra;
			n=n/10;
			
		}
		if(ncopy==ogl) 
			return 1; 
		else 
			return 0;
			
	}

}
