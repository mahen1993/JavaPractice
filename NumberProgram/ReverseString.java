package NumberProgram;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	String s,rev="";
	Scanner p = new Scanner(System.in);
	System.out.println("Enter the String");
	s=p.nextLine();
	int length = s.length();
	for (int i = length-1; i >=0; i--) {
		rev=rev+s.charAt(i);
	}System.out.println(rev);
	}
}

