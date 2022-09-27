package JavaPrograms;

import java.util.ArrayList;

public class Employee extends PojoClass {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
	Employee e1 = new Employee();
	e1.setId(11);
	e1.setName("mahendran");
	e1.setEmail("mahendran@gmail.com");
	Employee e2 = new Employee();
	e2.setId(12);
	e2.setName("marshall");
	e2.setEmail("marshal@gmail.com");
	Employee e3 = new Employee();
	e3.setId(13);
	e3.setName("magi");
	e3.setEmail("magi@gmail.com");
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	for (Employee e : emp) {
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getEmail()+"\n");
	}
	}

}
