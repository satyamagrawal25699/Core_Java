package IO_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class IODemo {
	public static void main(String[] args)throws Exception {
		File file=new File("newfile1.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.getAbsolutePath());
		file.renameTo(new File("newfile2.txt"));
	
		FileInputStream fis = new FileInputStream(file);
		
		
		FileReader reader=new FileReader(file);
		
	}
}
