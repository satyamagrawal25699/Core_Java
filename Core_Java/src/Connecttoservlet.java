import java.net.URL;
import java.net.URLConnection;

public class Connecttoservlet {
	public static void main(String[] args)throws Exception {
		URL url=new URL("http://localhost:2020/gteweb3online/Helloservlet");
		URLConnection urlcon=url.openConnection();
		urlcon.getInputStream();
		
		
	}
}
