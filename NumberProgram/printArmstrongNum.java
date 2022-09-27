package NumberProgram;

public class printArmstrongNum {
	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i <=1000; i++) {
			int num , rem = 0,sum = 0;
			num=i;
			while (num > 0) {
				rem=num%10;
				sum=(rem*rem*rem)+sum;
				num=num/10;
			}
			if (i == sum) {
				count++;
				
				System.out.println(i);
				
			} 			
		}
		System.out.println("Count of the Armstrong Number = "+count);
	}

}
