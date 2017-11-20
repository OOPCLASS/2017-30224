import java.math.BigDecimal;
import java.util.Scanner;

public class TestOperations {

	public static void main(String[] args) {

		int N;
		int scalar;

		// We introduce the dimension of the matrixes from the keyboard
		// We will work with square matrixes.
		System.out.println("Introduce the dimension of the matrixes:");

		Scanner in = new Scanner(System.in);
		N = in.nextInt();

		// We construct two matrixes
		BigDecimal[][] matrix1 = new BigDecimal[N][N];
		BigDecimal[][] matrix2 = new BigDecimal[N][N];

		// The elements of the matrix will be initialized to 0
		// Now we add them values.

		System.out.println("Fill the first matrix with values:");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix1[i][j] = in.nextBigDecimal();
			}
		}

		System.out.println("Fill the second matrix with values:");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix2[i][j] = in.nextBigDecimal();
			}
		}

		/// We construct the mr matrix to store the addition of the two previous
		/// matrixes
		BigDecimal[][] mr = new BigDecimal[N][N];

		mr = MatrixOperations.add(matrix1, matrix2, N);

		System.out.println("The result of the addition is");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mr[i][j] + "\t");
			}
			System.out.println("\n");
		}

		mr = MatrixOperations.subtract(matrix1, matrix2, N);

		System.out.println("The result of the subtraction is\n");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mr[i][j] + "\t");
			}
			System.out.println("\n");
		}

		mr = MatrixOperations.multiply(matrix1, matrix2, N);

		System.out.println("The result of the multiplication is\n");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mr[i][j] + "\t");
			}
			System.out.println("\n");
		}

		System.out.println("\nIntroduce the scalar you wish to multiply the matrix with");
		scalar = in.nextInt();

		System.out.println("The result of the multiplication with the scalar" + scalar + "is\n");
		mr = MatrixOperations.multiplyScalar(matrix1, N, scalar);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mr[i][j] + "\t");
			}
			System.out.println("\n");
		}

		if (N == 2 || N == 3) {
			System.out.println("The determinant of the first matrix is " + MatrixOperations.determinant(matrix1, N));
		} else {
			System.out.println("This program doesn't calculate determinants for dimensions bigger than 3");
		}

		if (MatrixOperations.areEqual(matrix1, matrix2, N)) {
			System.out.println("The two matrixes are identical");
		} else {
			System.out.println("The two matrices aren't identical");
		}

		if (MatrixOperations.isZeroMatrix(matrix1, N)) {
			System.out.println("Matrix1 is a zero matrix");
		} else {
			System.out.println("Matrix1 is not a zero matrix");
		}
		
		if(MatrixOperations.isIdentityMatrix(matrix1, N))
		{
			System.out.println("Matrix1 is an identity matrix");
		}
		else
		{
			System.out.println("Matrix1 is not an identity matrix");
		}
		
		System.out.println(MatrixOperations.fillDegree(matrix1, N)+"% of matrix 1 is covered by zeros");
	}

}
