package Util_Package_Exaamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		int i[]= {10,20,30,40};
		
		//ArrayList;
		//Linkedlist;
		//Vector;
		
		//ArrayList<Integer>list=new ArrayList<>();
		//LinkedList list=new LinkedList();
		Vector<Integer> list=new Vector<>();
		
		
		list.add(60);
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		
		
//		System.out.println(list);
//		System.out.println(list.contains(20));
//		
//		System.out.println("Size....."+list.size());
		
		
//		for(Object n:list) {
//			System.out.println(n);
//			
//		}
//		
//		for(int y=0;y<list.size();y++) {
//			System.out.println(y);
//		}
//		
//		Iterator iter=list.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
//		ListIterator litre=list.listIterator();
//				
//		while(litre.hasNext()) {
//			System.out.println(litre.next());
//			
//		}
//		
//		while(litre.hasPrevious()) {
//			System.out.println(litre.previous());
//		}
//		
		
//		Enumeration<Integer> en=list.elements();
//		list.add(70);
//		
//		while(en.hasMoreElements())
//		{
//			System.out.println(en.hasMoreElements());
//		}
		
		
//		Collections.sort(list);
//		System.out.println(list);
		
		Collections.synchronizedCollection(list);
		Collections.sort(list,(n1,n2)->{return n1.compareTo(n2);});
		System.out.println(list);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
