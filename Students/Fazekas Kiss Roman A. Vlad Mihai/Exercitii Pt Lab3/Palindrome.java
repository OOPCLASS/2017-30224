package pb1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		for(int i=1;i<1000;i++){
			for (int j=1;j<1000;j++){
				if (pal(i*j)){
					if ((i*j)>max){
						max=i*j;
					}
				}
			}
		}
		System.out.println(max);
	}
	
	public static Boolean pal(int n){
		 int x,palindr=0,temporar;
		 temporar=n;    
		 while(n>0){    
			 x=n%10;
			 palindr=(palindr*10)+x;    
			 n=n/10;    
		 }    
		 if(temporar==palindr)    
			   return true;    
			 else    
			   return false; 
	}

}
