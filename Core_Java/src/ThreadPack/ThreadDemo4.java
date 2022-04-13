package ThreadPack;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadDemo4 {
	public static void main(String[] args) {
		Kitchen kitchen=new Kitchen();
		ExecutorService es=Executors.newFixedThreadPool(4);
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				kitchen.cookRice();
				
			}
		});
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				kitchen.cutVeg();
				
			}
		});	
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				kitchen.cutNonVeg();
			}
		});	
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				kitchen.dum();
				
			}
		});	
		
		
		
		
		
		
		
	}
}


class Kitchen {
	public void cookRice() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" entered kitchen....");
		System.out.println(name+" cleaned rice.....");
		System.out.println(name+" rice kept on the stove Job over.....");
		try {Thread.sleep(5000);}catch(Exception E) {}
		System.out.println(" Rice is cooked ");
		
	
	}
	
	public void cutVeg() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" entered kitchen....");
		System.out.println(name+" cut vegetables .....");
		System.out.println(name+" Vegetables  kept on the stove Job over.....");
		try {Thread.sleep(2000);}catch(Exception E) {}
		System.out.println(" Veg is cooked ");
		
	
	}
	
	public void cutNonVeg() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" entered kitchen....");
		System.out.println(name+" cut NonVeg .....");
		System.out.println(name+" NonVeg  kept on the stove Job over.....");
		try {Thread.sleep(1000);}catch(Exception E) {}
		System.out.println(" NonVeg is cooked ");
		
	
	}
	
	public void dum() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" entered kitchen....");
		System.out.println(name+" Biryani put for Dum .....");
		System.out.println(name+" Biryani   kept on the stove Job over.....");
		System.out.println(" All cooks are free now take them ");
		try {Thread.sleep(8000);}catch(Exception E) {}
		System.out.println(" Biryani is cooked ");
		
	
	}
}
