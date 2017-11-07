
public class Spiral 
{
	
	public static final int DIMENSION = 26001;
	public static final int HALF_DIM = 13000;
	//e nevoie de o dimensiune de 26421 pt ca ratia sa fie mai mica de 10% pe float
	
	public static void main(String[] args) 
	{
		int[][] matrix = new int[DIMENSION][DIMENSION];
		float ratio = 1;
		int count = 1;
		int layer = 0;
		int primeNumbers = 0;
		int i = 0, j = 0;
		
		matrix[HALF_DIM][HALF_DIM] = 1;
		
		while (ratio > 0.1)
		{
			layer++;
			
			for (i = 0; i < 2 * layer; i++)
			{
				count++;
				matrix[HALF_DIM + layer - i - 1][HALF_DIM + layer] = count;
			}
			
			for (i = 0; i < 2 * layer; i++)
			{
				count++;
				matrix[HALF_DIM - layer][HALF_DIM + layer - i - 1] = count;
			}
			
			for (i = 0; i < 2 * layer; i++)
			{
				count++;
				matrix[HALF_DIM - layer + i + 1][HALF_DIM - layer] = count;
			}
			
			for (i = 0; i < 2 * layer; i++)
			{
				count++;
				matrix[HALF_DIM + layer][HALF_DIM - layer + i + 1] = count;
			}
			
			if (isPrime(matrix[HALF_DIM - layer][HALF_DIM - layer]))
				primeNumbers++;
			if (isPrime(matrix[HALF_DIM + layer][HALF_DIM - layer]))
				primeNumbers++;
			if (isPrime(matrix[HALF_DIM - layer][HALF_DIM + layer]))
				primeNumbers++;
			if (isPrime(matrix[HALF_DIM + layer][HALF_DIM + layer]))
				primeNumbers++;

			ratio = (float)primeNumbers / (layer * 4 + 1);
			System.out.println(ratio);
		}
		
		//printMatrix(matrix, layer);
		System.out.print(layer);
	}
	
	
	public static boolean isPrime(int number)
	{
		if (number <=  1)
			return false;
		else if (number % 2 == 0)	
			return false;
		else
		{
			int demp = 3;
			boolean isntPrime = true;
			
			while ((isntPrime) && (demp <= Math.sqrt(number)))
			{
				if (number % demp == 0)
					isntPrime = false;
				else
					demp += 2;
			}
			
			return isntPrime;
		}
	}
	
	public static int primeCount(int[][] matrix)
	{
		int i;
		int counter = 0;
		
		for (i = 0; i < DIMENSION; i++)
		{
			if (matrix[i][i] == 0)
				continue;
			
			if (isPrime(matrix[i][i]))
			{
				counter++;
				//System.out.println(matrix[i][i]);
			}
			if (isPrime(matrix[i][DIMENSION - 1 - i]))
			{
				counter++;
				//System.out.println(matrix[i][100 - i]);
			}
		}
		
		return counter;
	}

	public static void printMatrix(int[][] mat, int  layers)
	{
		int i, j;
		
		for (i = 0; i < 2 * layers + 1; i++)
		{
			for (j = 0; j < 2 * layers + 1; j++)
			{
				System.out.print(mat[HALF_DIM - layers + i][HALF_DIM - layers + j]);
				System.out.print("   ");
			}
			System.out.println("");
		}
	}
	
}
