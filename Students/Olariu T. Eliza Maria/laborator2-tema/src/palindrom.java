import java.util.Scanner;

public class palindrom {
	
	public static int ifPalindrom(int n){
		int aux;
		int pal=0;
		int uc;
		
		aux=n;
		while (aux>0){
			uc=aux%10;
			aux=aux/10;
			pal=pal*10+uc;
		}
		if (pal==n)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int nr;
		int palMax=0;
		int valMax=1;
		int valMin=1;
		
		System.out.println("Cate cifre?");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		for (i=1; i<=n; i++)
			valMax=valMax*10;
		valMin=valMax/10-1;
		valMax--;
		
		for (i=valMax; i>valMin; i--){
			for (j=valMax; j>valMin; j--){
				nr=i*j;
				if ((ifPalindrom(nr)==1) && (nr>palMax))
					palMax=nr;
			}
		}
		System.out.println(palMax);
	}

}
