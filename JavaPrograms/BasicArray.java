package JavaPrograms;

public class BasicArray {
	public static void main(String[] args) {
		int num[] = new int[6];
		num[0]=10;
		num[1]=20;
		num[4]=40;
		num[2]=50;
		num[2]=30;
		int len = num.length;
		for(int i=0;i<len;i++) {
			System.out.println(num[i]);
		}
		System.out.println();

for (int k : num) {
	System.out.println(k);
}
	}
}
