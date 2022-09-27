package NumberProgram;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		int n,j;
		Scanner mark =new Scanner(System.in);
		System.out.println("Enter Sub 1 Mark of the student");
		 n = mark.nextInt();
		System.out.println("Enter Sub 2 Mark of the student");
		 j = mark.nextInt();
		if (100>=n&&n>=90) {
			System.out.println("S Grade");
			
		} else if (89>=(n&j)&&(n&j)>=80) {
			System.out.println("A Grade");
		} else if (79>=(n&j)&&(n&j)>=70) {
			System.out.println("B Grade");
		}else if (69>=(n&j)&&(n&j)>=60) {
			System.out.println("C Grade");
		}else if (59>=(n&j)) {
			System.out.println("Fail");
		}

		}
	}


