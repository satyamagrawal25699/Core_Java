package Util_Package_Exaamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
//		Map<Integer, String> hm=new HashMap<Integer,String>();
		Map<Integer, String> hm=new TreeMap<Integer,String>();
		hm.put(100,"aspire");
		hm.put(20, "raara");
		hm.put(300, "raja");
		hm.put(200, "baja");
		
		System.out.println(hm);
		
		System.out.println(hm.get(200));
		
		Set<Map.Entry<Integer,String>> set=hm.entrySet();
		Iterator<Map.Entry<Integer, String>> iter=set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Integer,String> me=iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
			
		}
		
		
	}
}
