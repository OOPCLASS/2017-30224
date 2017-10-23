import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrixOperations {
		
	public static int n=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigDecimal [][] m1 = new BigDecimal [n][n];
		BigDecimal [][] m2 = new BigDecimal [n][n];
		BigDecimal [][] mr = new BigDecimal[n][n];
		BigDecimal scalar;
		int fill;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++){	
				m1[i][j] = in.nextBigDecimal();
			}
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++){	
				m2[i][j] = in.nextBigDecimal();
			}
		}

		mr = add(m1,m2);
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++){	
				System.out.print(mr[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		mr = substract(m1,m2);
		//mr=multiply(m1,m2);   returns null pointer exception
		
		
		System.out.println("Introduceti scalarul pentru op de multiplicare:");
		scalar = in.nextBigDecimal();
		mr = multiplyScalar(m1,scalar);
		System.out.println(areEqual(m1,m2));
		System.out.println(isZeroMatrix(m1));
		System.out.println(isIdentityMatrix(m1));
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++){	
				System.out.print(mr[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		fill=fillDegree(m1);
		System.out.println(fill);

		
		
	}
	
	public MatrixOperations(){
		
	}
	
	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b){
		BigDecimal [][] c = new BigDecimal[n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				c[i][j] =a [i][j].add(b[i][j]);
			}
		}
		return c;
	}
	
	public static BigDecimal[][] substract(BigDecimal[][] a, BigDecimal[][] b){
		BigDecimal [][] c= new BigDecimal[n][n];
		for (int i = 0; i < n ;i++){
			for (int j = 0; j < n; j++){
				c[i][j] = a[i][j].subtract(b[i][j]);
			}
		}
		return c;
	}
	
	public static BigDecimal[][] multiply (BigDecimal[][] a, BigDecimal[][] b){
		BigDecimal [][] c= new BigDecimal[n][n];
		BigDecimal aux;
		for (int i=0; i<=n; i++){
			for (int j=0;j<=n;j++){
				for (int k=0;k<n;k++){
					aux=a[i][k].multiply(b[k][j]);
					String x=new String();
					x=aux.toPlainString();
					Scanner z=new Scanner(x);
					//System.out.print(aux);
					c[i][j]=c[i][j].add(z.nextBigDecimal()); //returns null pointer exception
				}
			}
		}
		return c;
	}
	
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal scalar){
		BigDecimal [][] c= new BigDecimal[n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				c[i][j] = a[i][j].multiply(scalar);
			}
		}
		return c;
	}
	
	public static int determinant(BigDecimal[][] a){              
		
		int det = 0;

		if (a.length == 1)
			return a[0][0].intValue();

		if (a.length == 2) 
			return ((a[0][0].intValue() * a[1][1].intValue())-(a[0][1].intValue()*a[1][0].intValue()));
		
		for (int col = 0; col < n; col++) {
			BigDecimal[][] c = new BigDecimal[n - 1][n - 1];

			for (int line = 1; line < n; line++) {
				for (int k = 0; k < n; k++) {
					if (k < col) {
						c[line - 1][k] = a[line][k];
					} else if (k > col) {
						c[line - 1][line - 1] = a[line][k];
					}
				}
			}
			
			n--;
			
			det += a[0][col].intValue() * Math.pow (-1, col) * determinant (c);
		}
		return (det);

	}
	
	public static boolean areEqual(BigDecimal[][] a, BigDecimal[][] b){

		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if (a[i][j].compareTo(b[i][j])!=0){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean isZeroMatrix(BigDecimal[][] a){

		BigDecimal zero = new BigDecimal(0);
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if (a[i][j].compareTo(zero)!=0){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean isIdentityMatrix(BigDecimal[][] a){
		
		BigDecimal one = new BigDecimal(1);
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if (a[i][j].compareTo(one)!=0){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int fillDegree(BigDecimal[][] a){
		int fill=0;
		BigDecimal zero = new BigDecimal(0);
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if (a[i][j].compareTo(zero)!=0){
					fill++;
				}
			}
		}
		
		return 100*fill/(n*n);
	}
	
}
