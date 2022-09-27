package JavaPrograms;

import java.util.Vector;

public class List {
	public static void main(String[] args) {
		Vector<Integer> li = new Vector<Integer>();
		Vector<Integer> list = new Vector<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.remove(2);
		li.add(3, 300);
		li.set(4, 400);
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		boolean c = li.contains(300);
		System.out.println(c);
		
		for(int i=0;i<li.size();i++) {
	//System.out.print(i+"\t");
	System.out.println(i+"\t"+li.get(i));
		}
		
		list.addAll(li);
		System.out.println(li);
		System.out.println(list);
		for(Integer x:li) {
			//System.out.println(x);
		}
		
		System.out.println();
		int s = li.size();
		System.out.println(s+"   // size method used check the size of the arraylist \n");
		Integer g = li.get(4);
		System.out.println(g+" // get() method used to 4th index \n");
		//list.removeAll(li);
		
		//System.out.println(list+"  // RemoveAll method \n");
		list.retainAll(li);
		System.out.println(list+"  //retainAll method \n");
		li.clear();
		System.out.println(li+"  // Clear method ");
	}

}
