package pb1;

public class SumOfMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<1000;i++){
			if (i%3==0){
				
				if (i%5==0){
					sum=sum+i;
				} else sum=sum+i;
				
			} else if(i%5 == 0){
						sum=sum+i;
					}
		}
		System.out.println(sum);
	}

}
