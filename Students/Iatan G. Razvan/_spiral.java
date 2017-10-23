import java.util.Scanner;

public class _spiral {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	int n = keyboard.nextInt();
	int minCol = 0;
	int minRow = 0;
	int maxRow = n-1;
	int maxCol = n-1;
	int[][] matrix = new int[n][n];
	int value = 1;
	while(value <= n*n) {
	for(int i = minRow ; i <= maxRow ; i++) {
		matrix[i][minCol] = value;
		value++;
	}
	
	for(int i = minCol+1 ; i <= maxCol ; i++) {
		matrix[maxRow][i] = value;
		value++;
	}
	
	for(int i = maxRow-1 ; i >= minRow ; i--) {
		matrix[i][maxCol] = value;
		value++;
	}
	for(int i = maxCol-1 ; i >= minCol+1 ; i--) {
		matrix[minRow][i] = value;
		value++;
	}
	minRow++;
	minCol++;
	maxCol--;
	maxRow--;
	}
	for(int i = 0 ; i < n ; i++) {
		System.out.println();
		for(int j = 0 ; j < n ; j++) {
			System.out.print(matrix[i][j]+" ");
		}
	}
	}

}
