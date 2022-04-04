package Basic_Core_Java;

public class ClassDemo {
	public static void main(String[] args) {
		ClassDemo obj=new ClassDemo();
		Human human=new Male();
		System.out.println(human.name);
		
	}
}

class Human{
	String name="bbbbb";
	
	
}

class Male extends Human{//Kind of Relationship
	
}