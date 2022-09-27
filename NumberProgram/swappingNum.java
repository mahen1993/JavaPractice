package NumberProgram;

import java.util.Scanner;

public class swappingNum {
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Swapping Number :");
		a=scan.nextInt();
		b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping number are :");
		System.out.println(a);
		System.out.println(b);
		
	}

}
