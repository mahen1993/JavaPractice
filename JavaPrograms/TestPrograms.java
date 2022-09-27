package JavaPrograms;



public class TestPrograms {
public void forLoop() {
	System.out.println("Start");
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
		System.out.print(i);
		}System.out.println();
	}
	System.out.println("End of the program");
}
public void innerForLoop() {
	System.out.println("Inner For Loop with break & Continue");
for(int i=1;i<=10;i++) {
	/*if(i==5) {
		break;
	}
	System.out.print(i);
	System.out.println();*/
	if(i==5) {
		continue;
	}
	System.out.println(i);}}
private void evenNum() {
	System.out.println();
	System.out.println("Even Number 0 to 20 ");
for(int i=1;i<=20;i++) {
	if(i%2==0) {
		System.out.println(i);
	}}}
private void oddNum() {
	System.out.println();
	System.out.println("Odd Number 1 to 20 ");
for(int i=1;i<=20;i++) {
	if(i%2==1) {
		System.out.println(i);
	}}}
 private void sumOfEvenNum() {
	 System.out.println();
	 int count=0;
	for (int i = 1; i <=100; i++) {
		if(i%2==0) {
			count=count+i;
		}
	}System.out.println("Sum of the Even number is = "+count);
}
 private void sumOfOddNum() {
	 System.out.println();
	 int count=0;
	 for(int i=1;i<=100;i++) {
		 if(i%2==1) {
			 count=count+i;
		 }
	 }System.out.println("Sum of the ODD number is = "+count);
}
 private void factorialNum() {
	 System.out.println();
	 int count=1;
	 for(int i=1;i<=8;i++) {
		 count=count*i;
	 }
	 System.out.println("Sum of the factorial number is = "+count);
}
public static void main(String[] args) {
	TestPrograms t = new TestPrograms();
	t.forLoop();
	t.innerForLoop();
	t.evenNum();
	t.oddNum();
	t.sumOfEvenNum();
	t.sumOfOddNum();
	t.factorialNum();
	
}
}
