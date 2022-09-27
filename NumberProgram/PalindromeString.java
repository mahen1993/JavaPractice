package NumberProgram;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		String n,rev="";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		n=s.nextLine();
		int length = n.length();
		for (int i = length-1; i >=0; i--) {
			rev=rev+n.charAt(i);
		}
			if (n.equals(rev)) {
				System.out.println("Entered string is a palindrome");
			}else {
				System.out.println("Entered string is a not a palindrome");
			}
		}
		
	}


