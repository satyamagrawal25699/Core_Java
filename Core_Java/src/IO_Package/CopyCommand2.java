package IO_Package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyCommand2 {
	public static void main(String[] args)throws Exception {
		FileReader fis=new FileReader("new.txt");
		FileWriter fos=new FileWriter("Copy.txt");
		
	
	
		int eof=-1;
		int n=0;
		char b[]=new char[4];
		
		while((n=fis.read(b))!=eof) {
			String string=new String(b);
			System.out.println(string);
			fos.write(b,0,n);
			
		}
		
		
		
	}
}
