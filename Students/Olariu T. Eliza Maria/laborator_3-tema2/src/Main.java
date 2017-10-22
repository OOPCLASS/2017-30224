import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	static void writeMatrix(int rang, BigDecimal[][] mat){
		int i, j;
		
		for (i=0; i<rang; i++){
			for (j=0; j<rang; j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}
		
	static void getMatrix(int rang, BigDecimal[][] mat){
		int i, j;
		
		Scanner in=new Scanner(System.in);
		
		for (i=0; i<rang; i++)
			for (j=0; j<rang; j++)
				mat[i][j]=in.nextBigDecimal();
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MatrixOperation operation = new MatrixOperation();
		
		BigDecimal[][] mat1 = new BigDecimal[10][10];
		BigDecimal[][] mat2 = new BigDecimal[10][10];
		BigDecimal[][] result = new BigDecimal[10][10];
		
		BigDecimal num = new BigDecimal(0);
		
		Scanner in=new Scanner(System.in);
		int rang=in.nextInt();
		operation.rang=rang;
		
		getMatrix(rang, mat1);
		//writeMatrix(rang1, mat1);
		getMatrix(rang, mat2);
		//writeMatrix(rang2, mat2);
		
		System.out.println("ADD");
		result=operation.add(mat1, mat2);
		writeMatrix(rang, result);
		
		System.out.println("SUBSTRACT");
		result=operation.substract(mat1, mat2);
		writeMatrix(rang, result);
		
		System.out.println("MULTIPLY");
		result=operation.multiply(mat1, mat2);
		writeMatrix(rang, result);
		
		System.out.println("MULTIPLY SCALAR");
		num=in.nextBigDecimal();
		result=operation.multiplyScalar(mat1, num);
		writeMatrix(rang, result);
		
		System.out.println("ARE EQUAL");
		System.out.println(operation.areEqual(mat1, mat2));

		System.out.println("IS ZERO");
		System.out.println(operation.isZeroMatrix(mat1));
		
		System.out.println("IS IDENTITY");
		System.out.println(operation.isIdentityMatrix(mat1));
		
		System.out.println("FILL DEGREE");
		System.out.println(operation.fillDegree(mat1));
	}

}
