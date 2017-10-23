import java.util.Scanner;

public class _fibo {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int z = x+y;
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		System.out.print(x + " " + y +" "+z);
		int nr = 3;
		while(nr < n) {
			x=y;
			y=z;
			z=x+y;
			System.out.print(" "+z);
			nr++;
		}

	}

}
