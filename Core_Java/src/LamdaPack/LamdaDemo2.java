package LamdaPack;

public class LamdaDemo2 {
	public static void main(String[] args) {
		MyInter inter=()->{System.out.println("Void met of Myinter Called ");};
		inter.met();
		MyInter2 inter2=(n,m)->{System.out.println("met2 called of MyInter2"+n+" : "+m);};
		inter2.met2("Satyam", 20);
		
		
	}
}

interface MyInter{
	public void met();
	
}

interface MyInter2{
	public void met2(String name,int age);
}
