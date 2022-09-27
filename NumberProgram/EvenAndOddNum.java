package NumberProgram;

import java.util.Scanner;

import javax.naming.SizeLimitExceededException;

public class EvenAndOddNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scan.nextInt();
		if (n%2==0) {
			System.out.println("Even Number");
		}if(n%2==1) {
			System.out.println("Odd Number");
		}
		int count=100;
		for(int i=2;i<=count;i++) {
		if(i%2==1) {
			System.out.print("    ");
			System.out.println(i);
		}if (i%2==0) {
			System.out.print(i);
		}
		
	}		
	}

}
