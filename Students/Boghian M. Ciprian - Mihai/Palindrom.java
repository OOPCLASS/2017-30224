
public class Palindrom {
	public static int IsPalindrom(int prod)
	{
		int invers=0;
		int copy= prod;
		int t;
		while(prod>0)
		{
			t= prod % 10;
			invers = invers*10 + t;
			prod = prod / 10;
		}
		if(copy==invers)
			return 1;
		else
			return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		int maxim=0;
		int produs=0;
		int i,j;
		for(i=100;i<=999;i++) 
		{
			for(j=100;j<=999;j++) 
			{
				produs=i*j;
				if(IsPalindrom(produs)==1)
					if(produs>maxim)
						maxim=produs;
			}
			
		}
		System.out.println(maxim);
	}

}
