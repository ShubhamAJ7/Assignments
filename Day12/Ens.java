package Day12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ens {

public static void main(String[] args) {
    
    TreeMap<Integer,String> es= new TreeMap();
	
	es.put(1, "ram");
	es.put(2, "shubham");
	es.put(4, "ish");
	es.put(6, "rishj");
	es.put(9, "jain");
	System.out.println(es);
	
	Set<Entry<Integer,String>> ens=es.entrySet();
	
	Iterator itr=ens.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
    
}    
}
