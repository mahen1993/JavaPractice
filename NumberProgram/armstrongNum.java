package NumberProgram;

import java.util.Scanner;

public class armstrongNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scan.nextInt();
		//int num = 371;
		int rem=0,sum=0;
		int temp=input;
		while (temp>0) {
			rem=temp%10;
			sum=(rem*rem*rem)+sum;
			temp=temp/10;
			}
		if (sum==input) {
			System.out.println("This is armstrong number "+input);
			
		} else {
			System.out.println("This is not a armstrong number");

		}
	}

}
