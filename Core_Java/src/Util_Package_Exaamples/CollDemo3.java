package Util_Package_Exaamples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollDemo3 {
	public static void main(String[] args) {
		
		
		List<Student> slist=new LinkedList<>();
		slist.add(new Student("Rahim"));
		slist.add(new Student("Ram"));
		slist.add(new Student("Krushna"));
		slist.add(new Student("Karanim"));
		
		System.out.println(slist);
		
		Collections.sort(slist,(s1,s2)->{return s2.compareTo(s1);});
		
		System.out.println(slist);
		
		
	}
}

class Student{
	String name;
	public Student(String name){
		this.name=name;
	}
	
//	
	@Override
	
	public String toString() {
		return "The name is..."+name+"\n";
	}
	
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
}