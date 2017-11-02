import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ok = 0;
		for(int i = 9999 ; i >= 0 ; i--) {
			for(int z = 9999 ; z >= 0; z--) {
				for(int j = 9999 ; j >= 0 ; j--) {
					long x = j*z*i;
					if(isPalindrome(x)==1) {
						ok = 1;
						System.out.println("The biggest palindrom is " + x);
					}
					if(ok == 1)
						break;
				}
				if(ok == 1)
					break;
			}
			if(ok == 1)
				break;
		}

	}
	public static long isPalindrome(long x) {
		long savedNumber = x;
		long r = 0;
		while(savedNumber > 0) {
			r = r*10 + savedNumber % 10;
			savedNumber /= 10;
		}
		if(x == r && x != 0)
			return 1;
		else
			return 0;
	}

}
