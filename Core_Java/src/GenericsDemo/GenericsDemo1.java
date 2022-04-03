package GenericsDemo;

public class GenericsDemo1 {
	public static void main(String[] args) {
		PaintBrush<Water> brush=WaterContainer.getBrush();
		brush.setItem(new Water());
		Water water=(Water)brush.getItem();
		System.out.println(water);
//		brush.rp=new BluePaint();
//		System.out.println(brush.rp);
		
//		System.out.println(brush.getItem());
		
//		System.out.println(brush.getItem());
		
		
		PaintBrush<Paint> brush2=PaintContainer.getBrush();
		brush2.setItem(new Redpaint());
		Redpaint paint=(Redpaint)brush2.getItem();
		System.out.println(paint);
		
		PaintBrush<DryAir> brush3=DryContainer.getBrush();
		brush3.setItem(new DryAir());
		DryAir dryair=(DryAir)brush3.getItem();
		
		System.out.println(dryair);
		
		
//		PaintBrush<DryAir> brush3=new PaintBrush<>();
//		System.out.println(brush3);
//		
		
		
	}
}

class PaintContainer{
	public static PaintBrush<Paint> getBrush() {
		PaintBrush<Paint> brush=new PaintBrush<>();
		brush.setItem(new Redpaint());
		return brush;
		
	}
}

class WaterContainer{
public static PaintBrush<Water> getBrush() {
		PaintBrush<Water> brush=new PaintBrush<>();
		brush.setItem(new Water());
		return brush;
	}
}

class DryContainer{
	public static PaintBrush<DryAir> getBrush(){
		PaintBrush<DryAir> brush=new PaintBrush<>();
		return brush;
		
		
	}
}

//class PaintBrush{
//	public void doPaint(int i) {
//		if(i==1) {
//			System.out.println("Red Paint ");
//		}
//		else if(i==2) {
//			System.out.println("Blue Paint ");
//		}
//	}
//}

abstract class Paint{}

class Redpaint extends Paint{}
 
class BluePaint extends Paint{}

class Water{}

class DryAir{}


//class PaintBrush{
//	Paint rp;
//	
//}

//class PaintBrush{
//	Object item;
//
//	public Object getItem() {
//		return item;
//	}
//
//	public void setItem(Object item) {
//		this.item = item;
//	}
//	
//}

class PaintBrush<T>{
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}