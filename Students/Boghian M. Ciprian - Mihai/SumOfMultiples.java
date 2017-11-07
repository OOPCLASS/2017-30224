 import java.util.Scanner;
public class SumOfMultiples {

	public static void main(String[] args) {
	  int sum=0;
      Scanner keybord = new Scanner(System.in);
      int number = keybord.nextInt();
	  for(int i=0; i<number; i++) {
		  if(i%3==0 || i%5==0)
			  sum=sum+i;
			  }
       System.out.println("suma este "+sum);
	}

}
