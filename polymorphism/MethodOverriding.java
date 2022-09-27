package polymorphism;

public class MethodOverriding extends MethodOverLoading{
	public void studentDep() {
System.out.println("Information Technology");
	}
	public void studentClg() {
System.out.println("SRM Engineering");
	}
	public void studentId() {
System.out.println("Student ID : ");
	}
	public static void main(String[] args) {
		MethodOverriding m = new MethodOverriding();
		m.studentId();
		m.studentId(1234);
		m.studentId("mahendran");
		m.studentId(8344840448l, "magi@gmail.com");
		m.studentId("No.10, chennai", 600127);
		m.studentDep();
		m.studentClg();
	}

}
