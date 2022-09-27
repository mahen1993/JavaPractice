package NumberProgram;

import java.util.Scanner;

public class DescendingOrder {
public static void main(String[] args) {
	int n,temp;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value of number you want in the array");
	n=s.nextInt();
	int a[]= new int[n];
	System.out.println("Enter all the elemetns: ");
	for (int i = 0; i < n; i++) {
		a[i]=s.nextInt();
	}
	for (int i = 0; i < n; i++) {
		for (int j = i+1; j < n; j++) {
			if (a[i]>a[j]) {
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Descending Order of Array");
	for (int i = n-1; i >0; i--) {
		System.out.print(a[i]+",");
	}System.out.println(a[0]);
}
}
