package Util_Package_Exaamples;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ColDemo1 {
	public static void main(String[] args) {
		Vector<String> alist=new Vector<>();
		alist.add("Ram");
		alist.add("Shyam");
		alist.add("Satyam");
		
		System.out.println(alist);
		System.out.println("Aftre adding...."+alist.size());
		
		alist.remove(1);
		
		System.out.println(alist);
		System.out.println("After removing ........"+alist.size());
		
		for(String s:alist) {
			System.out.println(s);
		}
		
		Iterator iter=alist.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		ListIterator litre=alist.listIterator();
		
		while(litre.hasNext()) {
			System.out.println(litre.next());
		}
		
		while(litre.hasPrevious()){
			System.out.println(litre.previous());
			
		}
		
		Enumeration<String> en=alist.elements();
		alist.add("BBBBBBBBBB");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		System.out.println(alist.contains("Ram"));
		
		
		
		Collections.sort(alist);
		System.out.println(alist);
		
		
		
		
		
		
		
				
	}
}
