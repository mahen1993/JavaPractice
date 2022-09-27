package JavaPrograms;

public class StringBasic {
	public static void main(String[] args) {
		String s = "MAHENDRAN";
		char c = s.charAt(8);
		boolean b = s.equals("mahendran");
		System.out.println(b);
		boolean b1 = s.equalsIgnoreCase("Mahendran");
		System.out.println(b1);
		System.out.println(s);
		String s1 = "hello welcome wife is salomi sangeetha";
		String[] x = s1.split(" ");
		
		System.out.println();
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

for(int i=0;i<x.length;i++) {
	
	System.out.println(x[i]);
	
}
System.out.println();
for (String a : x) {
	String upperCase = a.toUpperCase();
	System.out.println(upperCase);
}
String m = "Hello java";
String z = m.substring(3);
System.out.println("\n"+z);
String z1 = m.substring(1, 6);
System.out.println(z1);
		
	}

}
