package Day12;

import java.util.HashSet;
import java.util.Iterator;

public class Hs {
    
    public static void main(String[] args) {
        HashSet hs=new HashSet(); //insertion order not preserve
        hs.add("shubham");
        hs.add("helo");
        hs.add(48);
        hs.add('y');
        for (int i=1;i<11;i++)
        {
            hs.add(i);
        }
        System.out.println(hs);

        Iterator itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

         
    }
}
