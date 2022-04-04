package Basic_Core_Java;

public class MethodDemo3 {
	public static void main(String[] args) {
		
	}
	
}

class Hall{
	protected void feast() {
		System.out.println("Its a general  hall ");
	}
}

class MarriageHall extends Hall{
	public void feast() {
		System.out.println("Bengal Feast Hall..");
		super.feast();
		
	}
	
	class BirthdayHall extends Hall{
	  
	}
}
