package NumberProgram;

import java.util.Scanner;

public class CheckingPrimeNum {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = input.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("This is a Prime number " + num);

		} else {
			System.out.println("This is not a Prime number " + num);
		}
		int prime,c=0;
		for (int n = 1; n <= 100; n++) {
			prime = 0;
			for (int m = 2; m <= n / 2; m++) {
				if (n % m == 0) {
					prime++;
				}
			}
			if (prime == 0) {
				c++;
				System.out.print(n);
				System.out.println();
			}
		}
		System.out.println("Total number of prime is = "+c);
	}

}
