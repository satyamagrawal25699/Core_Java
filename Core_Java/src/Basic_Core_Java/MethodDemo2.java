package Basic_Core_Java;

public class MethodDemo2 {
	public static void main(String[] args) {
		MethodDemo2 obj=new MethodDemo2();
		int ret=obj.met();
		String string=obj.met(100);
		System.out.println(string);
		System.out.println(obj.met(100));
		String var=obj.getName(100);
		System.out.println(var);
		
				
		
	}
	
	int met() {
		return 90;
		
	}
	
	String met(int i) {
		return "Hello";
	}
	
	boolean met(long l) {
		if(l==100) {
			return true;
		}
		else {
			return false;
		}
			}
	String getName(int rollno) {
		switch(rollno) {
		case 100:{
			return "Rahim";
		}
		default:{
			return "Unown";
		}
		}
	}
}
