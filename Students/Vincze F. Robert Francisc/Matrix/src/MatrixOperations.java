import java.math.BigDecimal;

public class MatrixOperations {

	public MatrixOperations() {

	}

	public static BigDecimal[][] add(BigDecimal[][] matrix1, BigDecimal[][] matrix2, int N) {

		BigDecimal[][] resultMatrix = new BigDecimal[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				resultMatrix[i][j] = matrix1[i][j].add(matrix2[i][j]);
			}
		}

		return resultMatrix;
	}

	public static BigDecimal[][] subtract(BigDecimal[][] matrix1, BigDecimal[][] matrix2, int N) {
		BigDecimal[][] resultMatrix = new BigDecimal[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				resultMatrix[i][j] = matrix1[i][j].subtract(matrix2[i][j]);
			}
		}

		return resultMatrix;

	}

	public static BigDecimal[][] multiply(BigDecimal[][] matrix1, BigDecimal[][] matrix2, int N) {
		BigDecimal sum = new BigDecimal(0);
		BigDecimal[][] resultMatrix = new BigDecimal[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sum = sum.subtract(sum);
				for (int k = 0; k < N; k++) {
					sum = sum.add(matrix1[i][k].multiply(matrix2[k][j]));
				}

				resultMatrix[i][j] = sum;
			}

		}

		return resultMatrix;
	}

	public static BigDecimal[][] multiplyScalar(BigDecimal[][] matrix, int N, int scalar) {

		BigDecimal toMultiplyWith = new BigDecimal(scalar);
		BigDecimal[][] resultMatrix = new BigDecimal[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				resultMatrix[i][j] = matrix[i][j].multiply(toMultiplyWith);
			}
		}

		return resultMatrix;

	}

	// The program is built in such way that we should call this
	// function only if the dimension of the matrix is 2 or 3
	public static BigDecimal determinant(BigDecimal[][] matrix, int N) {
		BigDecimal determinant = new BigDecimal(0);

		if (N == 2) {
			determinant = matrix[0][0].multiply(matrix[1][1]).subtract(matrix[1][0].multiply(matrix[0][1]));
		} else {
			/// We calculate the value of each of the 6 diagonals individually to make the
			/// code more understandable
			BigDecimal aux1 = new BigDecimal(0);
			BigDecimal aux2 = new BigDecimal(0);
			BigDecimal aux3 = new BigDecimal(0);
			BigDecimal aux4 = new BigDecimal(0);
			BigDecimal aux5 = new BigDecimal(0);
			BigDecimal aux6 = new BigDecimal(0);
			BigDecimal sum = new BigDecimal(0);
			BigDecimal difference = new BigDecimal(0);

			aux1 = matrix[0][0].multiply(matrix[1][1].multiply(matrix[2][2]));
			aux2 = matrix[1][0].multiply(matrix[2][1].multiply(matrix[0][2]));
			aux3 = matrix[2][0].multiply(matrix[0][1].multiply(matrix[1][2]));

			sum = aux1.add(aux2.add(aux3));

			aux4 = matrix[0][2].multiply(matrix[1][1].multiply(matrix[2][0]));
			aux5 = matrix[1][2].multiply(matrix[2][1].multiply(matrix[0][0]));
			aux6 = matrix[2][2].multiply(matrix[0][1].multiply(matrix[1][0]));

			difference = aux4.add(aux5.add(aux6));

			determinant = sum.subtract(difference);

		}
		return determinant;
	}

	public static boolean areEqual(BigDecimal matrix1[][], BigDecimal matrix2[][], int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!matrix1[i][j].equals(matrix2[i][j])) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isZeroMatrix(BigDecimal matrix[][], int N) {

		BigDecimal Zero = new BigDecimal(0);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!matrix[i][j].equals(Zero)) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isIdentityMatrix(BigDecimal matrix[][], int N) {
		BigDecimal One = new BigDecimal(1);
		BigDecimal Zero = new BigDecimal(0);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j && !(matrix[i][i].equals(One))) {
					return false;
				}

				if (i != j && !(matrix[i][j].equals(Zero))) {
					return false;
				}
			}
		}

		return true;
	}

	public static BigDecimal fillDegree(BigDecimal matrix[][], int N) {
		BigDecimal Zero = new BigDecimal(0);
		BigDecimal One = new BigDecimal(1);
		BigDecimal Count = new BigDecimal(0);
		BigDecimal TotalElements = new BigDecimal(N * N);
		BigDecimal TotalPercentage = new BigDecimal(100);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j].equals(Zero)) {
					Count = Count.add(One);
				}
			}
		}

		return Count.multiply(TotalPercentage.divide(TotalElements));
	}

}
