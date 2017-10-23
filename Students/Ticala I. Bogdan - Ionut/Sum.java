

public class Sum {

	public static void main(String[] args) {
		
		int n=1000, i;
		
		long sum=0;
		
		
		for(i=0; i<n; i++)
			if(i%5==0 || i%3==0)
				sum=sum+i;
		
		
		System.out.println("Suma este: "+ sum);

	}

}
