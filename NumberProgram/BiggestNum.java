package NumberProgram;

import java.util.Scanner;

public class BiggestNum {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the 4 number");
		a=num.nextInt();
		b=num.nextInt();
		c=num.nextInt();
		d=num.nextInt();
		if (a>b&&a>c&&a>d) {
			System.out.println("The biggest number is = "+a);
		} else if (b>a&&b>c&&b>d) {
			System.out.println("The biggest number is = "+b);
		} else if (c>a&&c>b&&c>d) {
			System.out.println("The biggest number is = "+c);
		} else if (d>a&&d>b&&d>c) {
			System.out.println("The biggest number is = "+d);
		} 
		
	}

}