import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		int a=1;
		int b =2;
		int c = 3;
		int sum=2;
		Scanner keybord = new Scanner(System.in);
		int n = keybord.nextInt();
		while(c<n){
			c=a+b;
			a=b;
			b=c;
			if(c%2==0)
				sum=sum+c;
		}
		System.out.println("Suma este "+sum);
	}

}
