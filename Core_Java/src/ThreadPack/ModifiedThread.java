package ThreadPack;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


public class ModifiedThread  {
	
	
	public static void main(String[] args)throws Exception {
		
		ExecutorService es=Executors.newFixedThreadPool(1);
		Future<String> future=es.submit(new MyThreadDemo3());
		String result=future.get();
				

		System.out.println("Main Thread Callled ");
	    for(int i=0;i<5;i++) {
	    	System.out.println(i);
	    	try {Thread.sleep(1000);}
	    	catch(Exception e) {}
	    	
	    }
		
	}
}

class MyThreadDemo3 implements Callable{
	@Override
	public String call() {
		System.out.println("Callable called");
		return "Call methods called" ;
	}
	
	
}
