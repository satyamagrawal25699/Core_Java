package IO_Package;

import java.io.BufferedInputStream;
import java.net.URL;
import java.net.URLConnection;

public class urlio {
	public static void main(String[] args)throws Exception {
		URL url=new URL("http://google.com/index.html");
		
		URLConnection urlcon=url.openConnection();
		BufferedInputStream bis=new BufferedInputStream(urlcon.getInputStream());
		
		
	}
}