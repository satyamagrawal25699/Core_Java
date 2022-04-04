package Basic_Core_Java;

public class VariableDemo2 {
	public static void main(String[] args) {
		A obj=new A();
		obj.s=100;
		A.ss=1000;
		
		A obj2=new A();
		obj2.s=1001;
		A.ss=101;
		obj.met(20);
	}
}

class A{
	int s;
	static int ss;//Class level variabel
	
	public void met(int i) {
		System.out.println(i);
	}
	
	public void met2(long l) {
		//l is the local variable
	}
	
	
}
