package tema1;

public class sum {
	public static void main(String[] args) {
		int suma;
		suma=0;
		for(int i=1;i<1000;i++) {
			if((i % 3==0) || (i % 5==0)) {
				suma=suma+i;	
			}
		}
		System.out.println(suma);
	}
}
