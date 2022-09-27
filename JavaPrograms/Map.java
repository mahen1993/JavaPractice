package JavaPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<Integer, String>();
		m.put(10, "Jave");
		m.put(20, "selenium");
		m.put(30, "Junit");
		m.put(40, "TestNG");
		m.put(50, "Cucumber");
		m.put(50, "Maven");
		System.out.println(m);
		String s = m.get(50);//get method print the value based on Key
		System.out.println(s);
		Set<Integer> set = m.keySet(); //KeySet md used to separate the key
		System.out.println(set);
		Collection<String> values = m.values();//values md used to separate the value
		System.out.println(values);
		Set<Entry<Integer,String>> entrySet = m.entrySet();//entrySet md used to Iterate the map
		for(Entry<Integer, String>x:entrySet) {
		System.out.print(x.getKey()+"\t");  //Iterate and print key separately 
		System.out.println(x.getValue());   //Iterate and print value separately
		
	}
	}
}
