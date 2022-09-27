package polymorphism;

public class MethodOverLoading {
	public void studentId(int id) {
System.out.println("ID : "+id);
	}
	public void studentId(String name) {
		System.out.println("Name : "+name);
	}
	public void studentId(long phone,String mail) {
		System.out.println("Phone No : "+phone+"\n"+"Mail ID :"+mail);
	}public void studentId(String add,int pin) {
		System.out.println("Address : "+add+"\n"+"Pincode :"+pin);

	}
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		m.studentId(1234);
		m.studentId("mahendran");
		m.studentId(8344840448l, "magi@gmail.com");
		m.studentId("No.10, chennai", 600127);
	}

}
