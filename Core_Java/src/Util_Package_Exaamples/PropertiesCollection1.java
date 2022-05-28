package Util_Package_Exaamples;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesCollection1 {
	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.put("a2", "Wlcome");
		prop.put("a4", "bye");
		prop.put("a1","Hello");
		prop.put("a3","hai");
		prop.put("a5", "bye");
		System.out.println(prop);
		
		
		Enumeration en=prop.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		
	}
	
}
