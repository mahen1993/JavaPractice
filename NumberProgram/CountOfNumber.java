package NumberProgram;

import java.util.Scanner;

public class CountOfNumber {
public static void main(String[] args) {
	int n,i=0;
	System.out.println("Enter a No");
	Scanner s = new Scanner(System.in);
	n=s.nextInt();
	
	while (n>0) {
		n=n/10;
		i++;
	}
	
	System.out.println("Total no of digits = "+i);
}
}
