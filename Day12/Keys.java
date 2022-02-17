package Day12;

    
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Keys {
public static void main(String[] args) {
	
	TreeMap<Integer,String> ks= new TreeMap();
	
	ks.put(1, "ram");
	ks.put(2, "shubham");
	ks.put(4, "ish");
	ks.put(6, "rishj");
	ks.put(9, "jain");
	System.out.println(ks);
	
	Set<Integer> keys=ks.keySet();
	
	Iterator itr=keys.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
