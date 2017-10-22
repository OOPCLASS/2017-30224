import java.util.Scanner;

public class Sum 
{

	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti numarul: ");
		int number = in.nextInt();
		int i;
		int sum=0;
		for(i=0;i<number;i++)
			if(i%3==0 || i%5==0)
				sum+=i;
		System.out.println("Suma numerelor divizibile cu 3 sau 5 este: "+sum);

	}

}
