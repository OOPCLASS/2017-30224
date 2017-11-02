
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=1;
		int n2=2;
		int sum=3;
		int aux;
		int i=2;
		
		while (n2<4000000){
			aux=n1+n2;
			n1=n2;
			n2=aux;
			sum=sum+n2;
			i++;
		}
		
		System.out.println(sum);
		//System.out.println(i);
	}

}
