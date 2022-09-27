package NumberProgram;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SecondMinimumNum {
public static void main(String[] args) {
	int n;
	//int a[]= {-12,23,-43,-34,43};
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the no's elements want");
	n=s.nextInt();
	int a[]= new int[n];
	System.err.println("Enter the elements");
	for (int i = 0; i < n; i++) {
		a[i] = s.nextInt();
		
	}
	for (int i = 0; i < n; i++) {
		for (int j = i+1; j < n; j++) {
			int temp1=0;
			if(a[i]<a[j]) {
			temp1=a[j];
			a[j]=a[i];
			a[i]=temp1;
			}
		}
	}for (int l = 0; l < a.length; l++) {
		System.out.println(a[l]);
		
	}
	System.out.println("The Second minimum number is : "+a[2]);
}

}
