package Basic_Core_Java;

public class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("Constructor Called....");
	}
	
	String name;
	String s;
	
	ConstructorDemo(String s){
		System.out.println("............"+s);
		name=s;
		this.s=s;
		
	}
	
	ConstructorDemo(String s,int i){
		System.out.println("............"+s+":"+i);
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Before constructor called ");
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println("After Constructor called ");
		ConstructorDemo obj2=new ConstructorDemo();
		
		
	}
}
