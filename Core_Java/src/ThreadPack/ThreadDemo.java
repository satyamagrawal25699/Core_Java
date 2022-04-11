package ThreadPack;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadDemo {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new MyThread());
//		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++) {
			
			try {
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		es.shutdown();
		}
	}
}

// Assign the job to the Thread creating the class of Thread and implementing interface Runnable 

class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread Logic goes here ");
	}
}


