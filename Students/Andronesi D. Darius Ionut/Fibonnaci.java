
public class Fibonnaci {

	public static void main(String[] args) {
		int a=1,b=1,c=0,sum=0;
		int count;
		while(c<4000000) {
			c=a+b;
			if((c%2)==0)
				sum=sum+c;
			
			a=b;
			b=c;
		}
		count=sum;
		System.out.println("Suma numerelor pare din sirul Fibonacci mai mici ca 4 mil="+count);
		
	}
}
