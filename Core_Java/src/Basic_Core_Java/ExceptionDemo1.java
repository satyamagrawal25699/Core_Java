package Basic_Core_Java;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		
		try {
			int i=1/Integer.parseInt(args[0]);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Handled Arithmetic Exception....");
			
		}
		
		catch(NumberFormatException e) {
			System.out.println("handle number format...");
		}
		
		finally {
			System.out.println("Finally Called ...");
		}
		
	
		
		System.out.println("after exception");
		
	}
}
		
	
