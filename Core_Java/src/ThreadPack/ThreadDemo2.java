package ThreadPack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new MyThread2());
		met1();
		met2();
		es.shutdown();
		
				
	}
	
	static void met1() {
		System.out.println("Met1 Called ........");
	}
	
	static int  met2() {
		System.out.println("Met2 Called .........");
		return 10;
	}
	
	static void met3() {
		System.out.println("Met3 called.......");
	}
}

class MyThread2 implements Runnable{
	@Override
	public void run() {
		ThreadDemo2.met3();
		
	}
}
