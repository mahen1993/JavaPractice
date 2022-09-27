package JavaPrograms;

public class StringProg {
	public static void main(String[] args) {
		String s = "Mahendran";
		String s1 ="mahen@1994";  // literal string (same value so its share same memory)
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s1));
		String z = s1.concat(s);
		System.out.println(z);
		System.out.println(System.identityHashCode(z));
		StringBuffer x = new StringBuffer("Mahendran");// Non-literal String its wont share, Create new memory
		StringBuffer x1 = new StringBuffer ("Mahendran");
		System.out.println("mutable String");
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(x1));
		x1.append(x);
		System.out.println(x1);
		System.out.println(System.identityHashCode(x1));
	}

}
