package Basic_Core_Java;

public class InterfaceDemo {
	public static void main(String[] args) {
		Human1 human=new Human1();
		
		AlopathyMedical stanley=new AlopathyMedical();
		UnaniMedicalCollege anna=new UnaniMedicalCollege();
		
		stanley.Docure();
		stanley.Docare();
		
		anna.Docure();
		
		
		
	}
}

interface Doctor{
	public void  Docure();
	
}


interface Nurse{
	public void Docare();
	
}

class Human1{
	
}

class AlopathyMedical implements Doctor,Nurse{
	@Override
	
	public void Docure() {
		System.out.println("Docure is being implementd by alopathy college ");
	}
	
	public void Docare() {
		System.out.println("Docare is being implements by  Docare ");
		
	}
	
}

class UnaniMedicalCollege implements Doctor{
	@Override
	public void Docure() {
		System.out.println("do cure is implemented by as per unani medicine ");
	}
}