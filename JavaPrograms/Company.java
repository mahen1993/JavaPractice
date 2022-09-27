package JavaPrograms;

public class Company extends SingleInheritance {
	public void compId() {
System.out.println("Company Id is 345");

	}
	public static void main(String[] args) {
		Company c = new Company();
		c.compId();
		c.empId();
		c.empName();
	}

}
