package NumberProgram;

import java.util.Scanner;

public class SplitAndReverseString {
public static void main(String[] args) {
	String o,rev="";
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the String Character");
	o=in.nextLine();
	int length = o.length();
	for (int i = length-1; i >=0; i--) {
		rev = rev+o.charAt(i);
		
	}
	System.out.println("Reversed String is = "+rev);
	String s1 ="Hello welcome to java class";
	String[] x = s1.split(" ");
	for (int i = 0; i <x.length; i++) {
		System.out.println(x[i]);
	}
}
}
