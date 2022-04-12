package ThreadPack;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class MyRunnable implements Runnable{
	ThreadDemo1 obj;
	
	
	public  MyRunnable(ThreadDemo1 obj) {
		this.obj=obj;
	}
	@Override
	public void run() {
		obj.met2();
		
	}
}


public class ThreadDemo1 {
	public static void main(String[] args) {
		
		System.out.println("Main Method ");
		ThreadDemo1 obj=new ThreadDemo1();
		
		Thread t=Thread.currentThread();
		ExecutorService es=Executors.newFixedThreadPool(1);
		obj.met1();
		es.execute(new MyRunnable(obj) );
		
		obj.met3();
		es.shutdown();
		
	}
	
	void met1() {
		System.out.println("Met1 called ");
	}
	
	void met2() {
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			
		}
		System.out.println("Met2 called ");

	}
	
	void met3() {
		System.out.println("Met3 called ");
	}
}


