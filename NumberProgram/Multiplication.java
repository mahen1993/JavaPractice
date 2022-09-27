package NumberProgram;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		int n,m;
		Scanner multi = new Scanner(System.in);
		System.out.println("Enter the table No");
		n=multi.nextInt();
		System.out.println("Enter the upto row");
		m=multi.nextInt();
		for (int i = 1; i <=m; i++) {
			int sum=0;
			sum=n*i;
			System.out.println(i+"*"+n+"="+sum);
		}
		System.out.println();
		for (int j = 1; j <=m; j++) {
			int sum1=0;
			sum1=n+j;
			System.out.println(j+"+"+n+"="+sum1);
		}
	}
	}

