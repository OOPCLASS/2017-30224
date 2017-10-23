package tema1;

public class palindrom {
	public static int palindrom1(int n) {
		int  temp, s;
		s=0;
		temp=n;
		while(temp != 0) {
		s=(s * 10) + temp %10;
		temp=temp / 10;
		}
		if(n == s) return 1;
		else return 0;
	}
	public static void main(String[] args) {
		int p;
		p=0;
		int max;
		max=0;
		for(int i=999;i>=100; i--) {
			for(int j=999;j>=100;j--) {
				p=i*j;
				if((palindrom1(p)==1) && (max<p)) {
					max=p;
					
				}
			}
			
		}
		System.out.println(max);	
	}	
}
