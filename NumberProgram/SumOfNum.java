package NumberProgram;

public class SumOfNum {
	public static void main(String[] args) {
		int n,m,sum=0;
		n=12345;
		while (n>0) {
			m=n%10;
			sum=sum+m;
			n=n/10;
		}
		System.out.println("Sum of the digits = "+sum);
	}

}
