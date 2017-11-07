import java.util.Scanner;

public class SumOfMultiples2 {

	public static void main(String[] args) {
		 double sum=0;
	      
		  for(int i=0; i<214748364; i++) {
			  if(i%3==0 || i%5==0) {
				  sum=sum+i;
			      if(sum>2147483647) {
			    	  System.out.println(i); 
			    	  break;
			      }
			  } 
		  }
	       System.out.println("suma este "+sum);
	}

}
