package IO_Package;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyCommad {
	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("new.txt");
		FileOutputStream fos=new FileOutputStream("Copy.txt");
		
		System.out.println(fis.available());
		
	
		int eof=-1;
		int n=0;
		byte b[]=new byte[fis.available()];
		
		while((n=fis.read(b))!=eof) {
			String string=new String(b);
			System.out.println(string);
			fos.write(b,0,n);
			
		}
		
	}
}
