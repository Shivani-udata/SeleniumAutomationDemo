package ext.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
public static void main(String args[]) {
	
	HashMap<Integer, String> hs = new HashMap<Integer,String>();
	hs.put(1, "INDIA");
	hs.put(2, "UK");
	hs.put(3, "US");
	hs.put(4, "Europe");
	
	System.out.println(hs);
	System.out.println(hs.get(3));
	hs.remove(3);
	System.out.println(hs.get(3));
	
	Set s = hs.entrySet();
	Iterator i = s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		//Map.Entry mp = (Map.Entry) i.next();
		
		//System.out.println(mp.getKey());
		//System.out.println(mp.getValue());
	}
	
	
}
}
