import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long sumFirstNumber = 0 ;
		long sumSecondNumber = 0;
		Scanner keyboard = new Scanner(System.in);
		int limitNumber = keyboard.nextInt();
		int firstNumber = keyboard.nextInt();
		int secondNumber = keyboard.nextInt();
		
		int remainder1 = firstNumber;
		int remainder2 = secondNumber;
		
		while(firstNumber < limitNumber) {
			sumFirstNumber += firstNumber;
			firstNumber += remainder1;
		}
		
		while(secondNumber < limitNumber) {
			sumSecondNumber += secondNumber;
			secondNumber += remainder2;
		}
		System.out.println("The first sum is "+sumFirstNumber);
		System.out.println("The second sum is "+sumSecondNumber);

	}

}
