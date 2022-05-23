package Util_Package_Exaamples;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollDemo5 {
	public static void main(String[] args) {
		
		Random r=new Random();
		Set<Integer> myset=new TreeSet<>();
		
		for(int i=0;i<10;i++) {
			System.out.println(r.nextInt(100));
		}
		
		System.out.println(myset);
		
	}
}
