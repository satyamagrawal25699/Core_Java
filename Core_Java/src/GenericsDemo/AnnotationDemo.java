package GenericsDemo;

public class AnnotationDemo {
	public static void main(String[] args) {
		TiffenBox<NonvegFood> box=NonvegCanteenContainer.getbox();
		NonvegFood food=box.getitem();
		System.out.println(food);
		
		TiffenBox<VegFood> box2=VegCanteenContainer.getbox();
		VegFood food2=box2.getitem();
		System.out.println(food2);
		
		TiffenBox<Currency> box3=HawalaContainer.getbox();
		Currency currency=box3.getitem();
		System.out.println(currency);
		
		
				
	}
}

class NonvegCanteenContainer{
	public static TiffenBox<NonvegFood> getbox() {
		TiffenBox<NonvegFood> box=new TiffenBox<>();
		box.setItem(new NonvegFood());
		return box;
		
	}
}



class VegCanteenContainer{
	public static TiffenBox<VegFood> getbox() {
		TiffenBox<VegFood>box=new TiffenBox<>();
		box.setItem(new VegFood());
		return box;
		
	}
}

class HawalaContainer{
	public static TiffenBox<Currency> getbox() {
		TiffenBox<Currency> box=new TiffenBox<>();
		box.setItem(new Currency());
		return box;
	}
}

class TiffenBox<T>{
	//VegFood food; - only vegfood object can be given
		//Food food; - only type of food can be given
		//Object item; - any object can be given, but while reading it may throw classcastexception
	
	T item;
	
	public T getitem() {
		return item;
		
	}
	
	public void setItem(T item) {
		this.item=item;
		
	}
}

class Food{}
class NonvegFood extends Food{}
class VegFood extends Food{}
class Currency{}