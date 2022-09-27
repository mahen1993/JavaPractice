package NumberProgram;

import java.util.Scanner;

public class palindromeNum {
public static void main(String[] args) {

	int n,a,i=0,j=0;
	Scanner an = new Scanner(System.in);
	System.out.println("Enter a Number");
	n = an.nextInt();
	a=n;
	while(a > 0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	if (n==j) {
		System.out.println("Palindrome number");
		
	}else {
		System.out.println("Not a palindrome number");
	}
	
}
}
