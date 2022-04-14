package ThreadPack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo5 {
	public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Rahim");
				synchronized(central) {
					central.bookTicket(1000);
					central.getchange();
				}
				
			}
		});
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Ram");
				synchronized(central) {
					central.bookTicket(2000);
					central.getchange();
				}
				
			}
		});
		es.shutdown();
	}
}

class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		Thread t=Thread.currentThread();
		String name=t.getName();
		this.amt=amt;
		System.out.println(name+" has bookes ticket of amount "+amt);
		System.out.println("..................................");
		try {Thread.sleep(1000);} catch(Exception e) {}
		System.out.println(name+" got waiting for change of amt "+(amt-100));
		
		
	}
	
  public void getchange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" got the change "+(amt-100));
		System.out.println("..................................");
		
	}
  
  
}

