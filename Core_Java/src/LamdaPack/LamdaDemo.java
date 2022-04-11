package LamdaPack;

public class LamdaDemo {
//Three types of inner classes;static,local,anonymous
	
	public static void main(String[] args) {
		Pepsi pepsi=new Pepsi();
		pepsi.sellcola();
		Kalimark kali=new Kalimark();
		kali.sellcola();
		
		
	}
}

abstract class Cola{
	public abstract void  makecola();//One Method abstract or interfaces called as functional interfaces
//	public abstract void makeFlavour();
	
	
}

interface colaInter {
	public void makecola();
}



class Pepsi{
	public void sellcola() {
//		Cola cola=new Kalimark().new Campcola();//This is how we access inner classes 
//		Cola cola=new Kalimark. Campcola();//Static innerclass 
//		cola.makecola();
//		System.out.println("Cola is selled by pepsi made by Campcola company as Pepsi ");
		
	}
	
	
}

class Kalimark{
	public void Canteen() {
		System.out.println("Emplaoyee eats here..........");
	}
	
	public void sellcola() {
		//This class is known as localinnerclass in java which can not be accesed by any other class .
//		class Campcola extends Cola{
//			
//			@Override
//			public void makecola() {
//				Canteen();
//				System.out.println("Cola made by Campacola ");
//			}
//			
////			@Override
////			public void makeFlavour() {
////				Canteen();
////				System.out.println("Flavour  made by Campacola ");
////			}
//			
//			}
//		Campcola cola=new Campcola();
//		cola.makecola();
		//This is known as anonymos inner class 
		new Cola() {
			@Override
			public void makecola() {
				
				System.out.println("Cola made by Campacola ");
			}
		}.makecola();
		
		//Lambda introduced JDK-2014; Lambda only works for interfaces and it oonly works in case of funct interfaces
		
		colaInter colaImpl=()->{System.out.println("Cola made as per Campcola ");};
		colaImpl.makecola();
		
		
		System.out.println("Cola is selled by Kalimark made by Campcola company as bovonto ");

	}
	
//	 class Campcola extends Cola{
//		
//		@Override
//		public void makecola() {
//			Canteen();
//			System.out.println("Cola made by Campacola ");
//		}
//		}

	
}
