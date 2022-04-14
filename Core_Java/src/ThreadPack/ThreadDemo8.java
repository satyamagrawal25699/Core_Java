package ThreadPack;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


public class ThreadDemo8 {
	public static void main(String[] args)throws Exception {
		
		ExecutorService es=Executors.newFixedThreadPool(1);
		Future obj=es.submit(new  Job());
		String value=(String)obj.get();
		System.out.println(value);
		es.shutdown();
		
		
		
				
	}
}

class Job implements Callable{
	@Override
	public Object call() {
		return "Returned by call method of ThreadJob ";
	}
}
