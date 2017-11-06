
public class Multiplii3si5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 
		 int totalthree=0;
		 int totalfive=0;
		 int total =0;
		 for(int i=0;i<1000;i++)
			 if(i%3==0 ) {
				 totalthree=totalthree+i;
			 }else if (i%5==0) {
				 totalfive=totalfive+i;
			 }
		 total=totalthree+totalfive;
		 System.out.println("Sum of all multiples of 3 or 5 below 1000="+total);
		

	}

}
