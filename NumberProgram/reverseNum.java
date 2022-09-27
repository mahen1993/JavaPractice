package NumberProgram;

import java.util.Scanner;

public class reverseNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = scan.nextInt();
		int rem=0;
		//rem=no;
		while(rem>0) {
			//rem=no%10;
			no=(no*10)+rem%10;
			rem=rem/10;
		}
		
		System.out.println("Reverse number is: "+no);
	}

}
