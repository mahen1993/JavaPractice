package JavaPrograms;

public class AbsSuperClass implements Abstract {

	@Override
	public void savings() {
System.out.println("saving regular");
	}

	@Override
	public void current() {
System.out.println("current");		
	}

	@Override
	public void salary() {
System.out.println("salary");		
	}

	@Override
	
	public void joint() {
System.out.println("joint");		
	}
	@Override
	public void brachDetails() {
System.out.println("Chennai");		
	}
	public static void main(String[] args) {
		AbsSuperClass a = new AbsSuperClass();
		a.brachDetails();
		a.savings();
		a.current();
		a.salary();
		a.joint();
	}

	

}
