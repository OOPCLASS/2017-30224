import java.math.BigDecimal;

public class MainMatrix 
{

	public static void main(String[] args) 
	{
		BigDecimal[][] matrix1 = new BigDecimal[][] {{BigDecimal.ONE, BigDecimal.ZERO}, 
												//	{BigDecimal.TEN, BigDecimal.ZERO}, 
													{BigDecimal.ZERO, BigDecimal.ONE}};
		BigDecimal[][] matrix2 = new BigDecimal[][] {{BigDecimal.TEN, BigDecimal.ONE},
													{BigDecimal.ZERO, BigDecimal.TEN}};
		
		
		if (MatrixOperations.isIdentityMatrix(matrix1))
			System.out.println("Identity matrix");
		else
			System.out.println("Not identity matrix");
		
		double fill = MatrixOperations.fillDegree(matrix1).doubleValue(); 
		System.out.println("Fill Degree : " + fill);
		
		BigDecimal[][] result = MatrixOperations.add(matrix1, matrix2);
		
		int i, j;
		
		for (i = 0; i < matrix1.length; i++)
		{
			for (j = 0; j < matrix1[0].length; j++)
			{
				System.out.print(result[i][j].intValue() + " ");
			}
			System.out.println("");
		}
			

	}

}
