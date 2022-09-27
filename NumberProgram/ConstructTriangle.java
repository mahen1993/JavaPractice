package NumberProgram;

import java.util.Scanner;

public class ConstructTriangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many rows you want in your Pyramid?");
		int noOfRows = s.nextInt();
		int rowCount = 1;
		System.out.println("Here is your Pyramid");
		for (int i = noOfRows; i >=1; i--) {
			for (int j = 1; j <=i*2; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <=noOfRows; j++) {
				System.out.print(j+" ");
			}
			for (int j = noOfRows; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount++;
		
		for (int r = noOfRows; r <=1; r++) {
			for(int c=1;c<-r*2;c++) {
			System.out.println(c+" ");
		}
	}
	}
}}
