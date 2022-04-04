package Basic_Core_Java;

class Parent{
	int i=20;
	static void met(int i) {
		System.out.println("Parent met is called "+i);
		
	}
}

public class StaticDemo extends Parent {
	public StaticDemo() {
		System.out.println("Cons called ");
		
	}
	
	static {
		System.out.println("The code common for static method  called here ");
	}
	
	public static void main(String[] args) {
		Parent.met(200);
		StaticDemo.met(100);
		
	}
	
	int i=10;
	
	static void met(int i) {
		new StaticDemo().i=20;
		System.out.println(i);
	}
	
	static void met() {
		System.out.println("Static method called 22222 ");
		
	}
	
	void met2(int i) {
		System.out.println("Non static method called ");
		System.out.println("i");
		System.out.println(this.i);
		System.out.println(super.i);
		
	}
	
}


