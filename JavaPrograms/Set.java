package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		ArrayList<Integer> set = new ArrayList<Integer>();
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(50);
		set1.addAll(set);
		// set.remove(30);
		/*set1.add();
		set1.add("Hello");
		set1.add("1000");
		for(int i:set1) {
			System.out.println(i);
		}*/
		System.out.println(set);
		System.out.println(set1+ "// Treeset print based on ASCII value ");
		int s = set.size()+set1.size();
		System.out.println(s);
	}

}
