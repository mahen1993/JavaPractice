package JavaPrograms;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
		System.out.println(10/0);//divided by zero Arithmetic Exception
		} 
		catch(ArithmeticException e) {
			System.out.println("Dont divide by Zero"); 
		}finally{ // combination try->catch->finally. without catch handling again show exception
			System.out.println("Final");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("Null");
		System.out.println("End \n");
		
		//Null Pointer Exception
		String s = null; 
		try{ 						//if we give string is null. it throws NullPointerException
		System.out.println(s.length());} //we try to find length of string but string value is null. 
		catch(NullPointerException e)	{//it throws NullPointerException because default string value is null.
		System.out.println("Null Pointer Exception \n");
		}
		  // InputMismatchException
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		try {
		int i = sc.nextInt(); // Defined input type is Integer instead user entered string as a input 
						      //it throws exception like InputMismatchException
		System.out.println(i); }
		catch(InputMismatchException e) {
			System.out.println("Input mismactch. Enter valid input \n");
		}
		
	  // IndexOutOfBoundException
		int num[]= new int[3];
		try {
		System.out.println(num[5]);  }
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index Out Bound. Give propare index value \n");
		}
		
	  // StringOutOfBoundException 	  
		String str = "Java";             // string value is 0 to 3 but try get char of 5 
		try {
		System.out.println(str.charAt(5));  }
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String out of bound. Give valid key to get char \n");
		}
		
		// IndexOutOfBountException
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);     //Defined arrayList index length is 0 to 2 but try get index of 5
		try{
			System.out.println(ar.get(2));
		System.out.println(ar.get(5));   }
		catch(IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBountException. Give valid input to get the value \n");
		}
		
		//NumberFormatException
		String st = "1234";
		
		System.out.println(st+5);
		try {
		int i = Integer.parseInt(st);
		System.out.println(i+5);}
		catch(NumberFormatException e) {
			System.out.println("Inner catch");
		}finally {
			System.out.println("Inner Finally");
		}try {
		String sta = "123abc45";
		int j = Integer.parseInt(sta);
		System.out.println(j+5);  }
		catch (NumberFormatException e) {
System.out.println("Outer Catch");
		}
		finally {
			System.out.println("Outer finally");  
		}
		
		
		

	}

}
