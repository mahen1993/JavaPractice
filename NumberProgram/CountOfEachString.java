package NumberProgram;

import java.util.HashMap;
import java.util.Iterator;

public class CountOfEachString {
public static void main(String[] args) {
	String s = "salomi sangeetha";
	String[] split = s.split(" ");
	HashMap<String, Integer> emp = new HashMap<String,Integer>();
	for (String c : split) {
		if (emp.containsKey(c)) {
			int x = emp.get(c);
			emp.put(c, x + 1);
			
		}else {
			emp.put(c, 1);
		
		}
		
	}
	System.out.println(emp);
}
}
