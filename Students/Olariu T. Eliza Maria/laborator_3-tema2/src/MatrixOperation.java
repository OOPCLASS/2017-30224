import java.math.BigDecimal;

public class MatrixOperation {
	
	static int rang;
	
	static BigDecimal[][] add(BigDecimal[][] mat1, BigDecimal[][] mat2){
		BigDecimal[][] result = new BigDecimal[rang][rang];
		int i, j;
		
		for (i=0; i<rang; i++)
			for (j=0; j<rang; j++)
				result[i][j]=mat1[i][j].add(mat2[i][j]);
		return result;
	}
	
	static BigDecimal[][] substract(BigDecimal[][] mat1, BigDecimal[][] mat2){
		BigDecimal[][] result = new BigDecimal[rang][rang];
		int i, j;
		
		for (i=0; i<rang; i++)
			for (j=0; j<rang; j++)
				result[i][j]=mat1[i][j].subtract(mat2[i][j]);
		return result;
	}
	
	static BigDecimal[][] multiply(BigDecimal[][] mat1, BigDecimal[][] mat2){
		BigDecimal[][] result = new BigDecimal[rang][rang];
		int i, j, k;
		BigDecimal s= new BigDecimal(0);
		BigDecimal aux= new BigDecimal(0);
		
		for (i=0; i<rang; i++)
			for (j=0; j<rang; j++){
				s=s.subtract(s);
				for (k=0; k<rang; k++){
					aux=mat1[i][k].multiply(mat2[k][j]);
					s=s.add(aux);
				}
					
				result[i][j]=s;
			}
				
		return result;
	}
	
	static BigDecimal[][] multiplyScalar(BigDecimal[][] mat1, BigDecimal number){
		BigDecimal[][] result = new BigDecimal[rang][rang];
		int i, j;
		
		for (i=0; i<rang; i++)
			for (j=0; j<rang; j++)
				result[i][j]=mat1[i][j].multiply(number);
		return result;
	}
	
	static Boolean areEqual(BigDecimal[][] mat1, BigDecimal[][] mat2){
		
		int i, j;
		
		for (i=0; i<rang; i++)
			for (j=0; j<rang; j++)
				if (mat1[i][j].compareTo(mat2[i][j])!=0)
					return false;
		return true;
	}
	
	static Boolean isZeroMatrix(BigDecimal[][] mat){
		
		int i, j;
		BigDecimal ZERO = new BigDecimal(0);
		
		for (i=0; i<rang; i++)
			for (j=0; j<rang; j++)
				if (mat[i][j].compareTo(ZERO)!=0)
					return false;
		return true;
	}
	
	static Boolean isIdentityMatrix(BigDecimal[][] mat){
		
		int i, j;
		BigDecimal ZERO = new BigDecimal(0);
		BigDecimal ONE = new BigDecimal(1);
		
		for (i=0; i<rang; i++)
			for (j=0; j<rang; j++)
				if (((mat[i][j].compareTo(ZERO)!=0) && (i!=j)) || ((mat[i][j].compareTo(ONE)!=0) && (i==j)))
					return false;
		return true;
	}
	
	static BigDecimal fillDegree(BigDecimal[][] mat){
		
		int i, j;
		BigDecimal count = new BigDecimal(0);
		BigDecimal ZERO = new BigDecimal(0);
		BigDecimal ONE = new BigDecimal(1);
		BigDecimal rangBD = new BigDecimal(rang*rang);
		
		for (i=0; i<rang; i++)
			for (j=0; j<rang; j++)
				if (mat[i][j].compareTo(ZERO)!=0)
					count=count.add(ONE);
		
		return count.divide(rangBD);
	}
	
}
