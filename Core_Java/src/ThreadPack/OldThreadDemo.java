package ThreadPack;
import java.util.concurrent.Callable;

public class OldThreadDemo {
	public OldThreadDemo(){
		Thread t=new Thread(new MyThreadJob());
		//Thread t=new Thread(new MyThreadJob2());//Can not use callable interface in OldThread.
		//Old thread supports only void methods but do not support returnable methods.
		t.start();
		
	}
	
	public static void main(String[] args) {
		
		new OldThreadDemo();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
		
	}
}

class MyThreadJob implements Runnable{
	@Override
	public void run(){
		System.out.println("Child Thread called ");
	}
}

class MyThreadJob2 implements Callable <String> {
	@Override
	public String call() throws Exception {
		return "Callable method called ";
	}
	
}