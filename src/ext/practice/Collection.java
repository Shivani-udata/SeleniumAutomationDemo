package ext.practice;

import java.util.HashSet;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Set only allows unique values, 
		//HashSet, TreeSet, LinkedHashSet implements Set Interface
		//there is no guarantee that elements will stored sequentially
		HashSet<String> s = new HashSet<String>();
		s.add("UK");
		s.add("INDIA");
		s.add("US");
		s.add("INDIA");
		
		System.out.println(s);
		
		System.out.println(s.remove("US"));
		System.out.println(s.size());
		System.out.println(s.contains("UK"));
		System.out.println(s.isEmpty());

	}

}
