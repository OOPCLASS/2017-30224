import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		int i;
		
		Scanner in = new Scanner(System.in);
		int number=in.nextInt();
		
		for (i=1; i<number; i++){
			if ((i%3==0) || (i%5==0))
				s=s+i;
		}
		
		System.out.println(s);
	}

}
