import java.math.BigDecimal;

public class MatrixOperations 
{

	
	public static BigDecimal[][] add(BigDecimal[][] firstMatrix, BigDecimal[][] secondMatrix)
	{
		int rowsFirst = firstMatrix.length;
		int columnsFirst = firstMatrix[0].length;
		int rowsSecond = secondMatrix.length;
		int columnsSecond = secondMatrix[0].length;
		
		if (rowsFirst != rowsSecond || columnsFirst != columnsSecond)
			throw new RuntimeException("Illegal matrix dimensions.");
		
		int i, j;
		
		BigDecimal[][] result = new BigDecimal[rowsFirst][columnsFirst];
		
		for (i = 0; i < rowsFirst; i++)
		{
			for (j = 0; j < columnsFirst; j++)
			{
				result[i][j] = firstMatrix[i][j].add(secondMatrix[i][j]);
			}
		}
		
		return result;
	}
	
	public static BigDecimal[][] substract(BigDecimal[][] firstMatrix, BigDecimal[][] secondMatrix)
	{
		int rowsFirst = firstMatrix.length;
		int columnsFirst = firstMatrix[0].length;
		int rowsSecond = secondMatrix.length;
		int columnsSecond = secondMatrix[0].length;
		
		if (rowsFirst != rowsSecond || columnsFirst != columnsSecond)
			throw new RuntimeException("Illegal matrix dimensions.");
		
		int i, j;
		
		BigDecimal[][] result = new BigDecimal[rowsFirst][columnsFirst];
		
		for (i = 0; i < rowsFirst; i++)
		{
			for (j = 0; j < columnsFirst; j++)
			{
				result[i][j] = firstMatrix[i][j].subtract(secondMatrix[i][j]);
			}
		}
		
		return result;
	}
	
	
	public static BigDecimal[][] multiply(BigDecimal[][] firstMatrix, BigDecimal[][] secondMatrix)
	{
		int rowsFirst = firstMatrix.length;
		int columnsFirst = firstMatrix[0].length;
		int rowsSecond = secondMatrix.length;
		int columnsSecond = secondMatrix[0].length;
		
		if (columnsFirst != rowsSecond)
			throw new RuntimeException("Illegal matrix dimensions.");
		
		BigDecimal[][] result = new BigDecimal[rowsFirst][columnsSecond];
		int i, j, k;
		
		for (i = 0; i < rowsFirst; i++)
		{
			for (j = 0; j < columnsSecond; j++)
			{
				for (k = 0; k < columnsFirst; k++)
				{
					result[i][j].add(firstMatrix[i][k].multiply(secondMatrix[k][j]));
				}
			}
		}
		
		return result;
	}
	
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] matrix, BigDecimal scalar)
	{
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		BigDecimal[][] result = new BigDecimal[rows][columns];
		int i ,j;
		
		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < columns; j++)
			{
				result[i][j] = scalar.multiply(matrix[i][j]);
			}
		}
		
		return result;
	}
	
	public static boolean areEqual(BigDecimal[][] firstMatrix, BigDecimal[][] secondMatrix)
	{
		boolean equals = true;
		int rowsFirst = firstMatrix.length;
		int columnsFirst = firstMatrix[0].length;
		int rowsSecond = secondMatrix.length;
		int columnsSecond = secondMatrix[0].length;
		
		if (rowsFirst != rowsSecond || columnsFirst != columnsSecond)
			throw new RuntimeException("Illegal matrix dimensions.");
		
		int i ,j;
		
		for (i = 0; i < rowsFirst && equals; i++)
		{
			for (j = 0; j < columnsFirst && equals; j++)
			{
				equals = firstMatrix[i][j].equals(secondMatrix[i][j]);
			}
		}
		
		return equals;
	}
	
	public static boolean isZeroMatrix(BigDecimal[][] matrix)
	{
		boolean isZero = true;
		int rows = matrix.length;
		int columns = matrix[0].length;
		int i, j;
		
		
		for (i = 0; i < rows && isZero; i++)
		{
			for (j = 0; j < columns && isZero; j++)
			{
				isZero = matrix[i][j].equals(BigDecimal.ZERO);
			}
		}
		
		return isZero;
	}
	
	public static boolean isIdentityMatrix(BigDecimal[][] matrix)
	{
		boolean isIdentity = true;
		int rows = matrix.length;
		int columns = matrix[0].length;
		int i, j;
		
		if (rows != columns)
			throw new RuntimeException("Illegal matrix dimensions.");
		
		for (i = 0 ; i < rows && isIdentity; i++)
		{
			for (j = 0; j < columns && isIdentity; j++)
			{
				if (i == j)
					isIdentity = matrix[i][j].equals(BigDecimal.ONE);
				else
					isIdentity = matrix[i][j].equals(BigDecimal.ZERO);
			}
		}
		
		return isIdentity;
	}
	
	public static BigDecimal fillDegree(BigDecimal[][] matrix)
	{
		int fill = 0;
		int rows = matrix.length;
		int columns = matrix[0].length;
		int i, j;
		
		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < columns; j++)
			{
				if (!matrix[i][j].equals(BigDecimal.ZERO))
					fill++;
			}
		}
		
		BigDecimal fillIs = new BigDecimal((double)fill / (rows * columns));
		
		return fillIs;
	}
}
