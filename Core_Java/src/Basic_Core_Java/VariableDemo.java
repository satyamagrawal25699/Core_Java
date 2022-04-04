package Basic_Core_Java;

public class VariableDemo {
public static void main(String[] args) {
	Laddu ladu=new Laddu();
	int i;
	VariableDemo obj=new VariableDemo();
	System.out.println("Before Passing .."+ladu.size);
	System.out.println("After Passing ");
}

void pbv(int size) {
	size=5;
	
}
void pbr(Laddu lad) {
	lad.size=5;
}
}

class Laddu{
	int size=10;
}
