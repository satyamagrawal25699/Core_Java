package ThreadPack;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadDemo7 {
	public static void main(String[] args) {
		Gun boforce=new Gun();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					boforce.fill();
				}
				
			}
		});
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					boforce.fire();
				}
				
			}
		});
		
		es.shutdown();
				
	}
}
//Inter Thread Communication.
class Gun{
	boolean flag;
	synchronized public void fill() {
		
		if(flag){
			try {wait();}catch(Exception e) {}
			
		}
		
		System.out.println("fill the gun");
		flag=true;
		notify();
	}
	
	synchronized public void fire() {
		if(!flag){
			try {wait();}catch(Exception e) {}
			
		}
		
		System.out.println("Shoot the gun ");
		flag=false;
		notify();
	}
	
}
