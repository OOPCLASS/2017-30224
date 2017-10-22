import java.math.BigDecimal;

public class MatrixOperations {


	public static BigDecimal[][] add(BigDecimal[][] matrix1,BigDecimal[][] matrix2){
		
		if(matrix1.length!=matrix2.length || matrix1[0].length!=matrix2[0].length) {
			return null ;
		}
		else {
			BigDecimal[][] matrix3 = new BigDecimal[matrix1.length][matrix1[0].length];
			for(int i=0; i<matrix1.length; i++)
				for(int j=0; j<matrix1[0].length; j++)
						matrix3[i][j]=matrix1[i][j].add(matrix2[i][j]);
			return matrix3;
			
			}

	}
	
	public static BigDecimal[][] subtact(BigDecimal[][] matrix1,BigDecimal[][] matrix2){
		
		if(matrix1.length!=matrix2.length || matrix1[0].length!=matrix2[0].length) {
			return null ;
		}
		else {
			BigDecimal[][] matrix3 = new BigDecimal[matrix1.length][matrix1[0].length];
			for(int i=0; i<matrix1.length; i++)
				for(int j=0; j<matrix1[0].length; j++)
						matrix3[i][j]=matrix1[i][j].subtract(matrix2[i][j]);
			return matrix3;
			
			}

	}
	
	public static BigDecimal[][] multiply(BigDecimal[][] matrix1,BigDecimal[][] matrix2){
		
		if(matrix1[0].length!=matrix2.length)
			return null;
		else {
			
			BigDecimal[][] matrix3 = new BigDecimal[matrix1.length][matrix2[0].length];
			for(int j=0; j<matrix2.length; j++)
				for(int i=0; i<matrix1[0].length;i++)
					matrix3[j][i]= matrix1[j][i].add(matrix2[i][j]);
			return matrix3;
		}
	}
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] matrix, BigDecimal scalar){
		BigDecimal[][] matrix1 = new BigDecimal[matrix.length][matrix[0].length];
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix.length; j++)
				matrix1[i][j]=matrix[i][j].multiply(scalar);
		return matrix;
	}
	
	public static boolean isEqual(BigDecimal[][] matrix1,BigDecimal[][] matrix2) {
		if(matrix1.length!=matrix2.length || matrix1[0].length!=matrix2[0].length)
			return false;
		else {
			for(int i=0; i<matrix1.length; i++)
				for(int j=0; j<matrix1[0].length; j++)
					if(!matrix1[i][j].equals(matrix2[i][j]))
						return false;
		return true;
		}
	}
	
	public static boolean isZeroMatrix(BigDecimal[][] matrix) {
		BigDecimal zero = new BigDecimal(0);
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix[0].length; j++)
				if(!matrix[i][j].equals(zero))
					return false;
		return true;
	}
	

	public static boolean isIdentifyMatrix(BigDecimal[][] matrix) {
		BigDecimal one = new BigDecimal(1);
		BigDecimal zero = new BigDecimal(0);
		
		for(int i=0;i<matrix.length; i++)
			for(int j=0; j<matrix[0].length; j++)
				if(i == j) {
					if(!matrix[i][j].equals(one))
						return false;
				}
				else
					if(!matrix[i][j].equals(zero))
						return false;
		return true;
					
	}
	
	public static BigDecimal fillDegree(BigDecimal[][] matrix) {
		BigDecimal zero = new BigDecimal(0);
		int number = 0;
		
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix[0].length; j++)
				if(!matrix[i][j].equals(zero))
					number++;
		BigDecimal per = new BigDecimal((number*100)/(matrix.length*matrix[0].length));
		return per;
	}
	
	public static BigDecimal determinant(BigDecimal[][] matrix,int rank) {
		BigDecimal det = new BigDecimal(0);
		
			if(rank == 1)
				return matrix[0][0];
			else
				if(rank == 2)
					return (matrix[0][0].multiply(matrix[1][1])).add((matrix[0][1].multiply(matrix[1][0])));
				else
					for(int col1=0; col1<rank; col1++) {
						BigDecimal[][] m= new BigDecimal[rank-1][rank-1];
						
						for(int i=1; i<rank; i++) {
							int col2 =0;
							for(int j=0; j<rank;j++)
								if(j != col2) {
									m[i-1][col2] = matrix[i][j];
									col2++;
								}
						}
						BigDecimal pow= new BigDecimal( Math.pow(-1.0, 2.0 +col1));
						det = det.add((pow.multiply(matrix[0][col1])).multiply(determinant(m, rank-1)));
					}
			return det;
	}
}
