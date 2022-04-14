package Basic_Core_Java;

public class JdkInterfaceDemo {
	public static void main(String[] args) {
		JDKImpl obj=new JDKImpl();
		obj.met2();
	}
}

interface JdkInterface{
	
	
	
	private void met() {
		System.out.println("Private method called ");
	}
	
	public default void  met2() {
		met();
		System.out.println("Public method called ");
	}
}

class JDKImpl implements JdkInterface{
	
}
