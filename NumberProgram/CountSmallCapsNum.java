package NumberProgram;

public class CountSmallCapsNum {
	public static void main(String[] args) {
		String s = "Hi welcome to java classes Tommorrow At 2.00p.m!!";
		int count = 0,count1 = 0,count2 = 0,count3 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a'&&s.charAt(i)<='z') {
				count++;
			}else if (s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				count1++;
			}else if (s.charAt(i)>='0'&&s.charAt(i)<='9') {
				count2++;
				
			}else  {
				count3++;
			}
			
		}
		System.out.println("Total no of small letters : "+count);
		System.out.println("Total no of Capital letters : "+count1);
		System.out.println("Total no of digits : "+count2);
		System.out.println("Total no of special characters : "+count3);
	}

}
