package Util_Package_Exaamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollDemo4 {
	public static void main(String[] args) {
		Set<String> myset=new HashSet<>();
		myset.add("apple");
		myset.add("Ball");
		myset.add("Dog");
		myset.add("Cat");
		myset.add("Cat");
		System.out.println(myset);
		
		Iterator<String> iter=myset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
//		Set<String> myset1=new TreeSet<>();
//		myset1.add("apple");
//		myset1.add("Ball");
//		myset1.add("Dog");
//		myset1.add("Cat");
//		myset1.add("Cat");
//		System.out.println(myset1);
		
		
	}
		
		
		
		
		
	}


