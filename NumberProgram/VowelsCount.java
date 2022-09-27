package NumberProgram;

import java.util.Scanner;

public class VowelsCount {
public static void main(String[] args) {
	//String a ="Welcome";
	Scanner str = new Scanner(System.in);
	System.out.println("Enter your string character");
	  String a = str.next();
	int vowels=0;
	int nonvowels=0;
	
	for (int i = 0; i < a.length(); i++) {
		char ch = a.charAt(i);
		if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||
				ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			vowels++;
			
		}else {
			nonvowels++;
		}
		
	}System.out.println("Vowels counts is = "+vowels);
	System.out.println("NonVowels counts is = "+nonvowels);
}
}
