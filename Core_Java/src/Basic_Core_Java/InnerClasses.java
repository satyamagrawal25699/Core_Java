package Basic_Core_Java;

public class InnerClasses {
	public static void main(String[] args) {
		Outer.Innerstatic ins=new Outer.Innerstatic();
		ins.met();
		Outer.InnerNonstatic in=new Outer().new InnerNonstatic();
		in.met();
		
		
	}
}

class Outer{
	void OutMet() {
		System.out.println("Non static met called ");
	}
	
	static void staticOutmet() {
		System.out.println("Static outer met called ");
	}
	
	static class  Innerstatic{
		public void met() {
			System.out.println("static inner class called ");
			staticOutmet();
			
		}
		
	}
	
	class InnerNonstatic{
		public void met() {
			System.out.println("Non static method called ");
			OutMet();
			staticOutmet();
			
		}
	}
}
