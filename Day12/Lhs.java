package Day12;

import java.util.Iterator;
import java.util.LinkedHashSet;



public class Lhs {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet(); //inseertion order prese3rve
     lhs.add("shubham");
     lhs.add("helo");
     lhs.add(48);
     lhs.add('y');
     for (int i=1;i<11;i++)
        {
            lhs.add(i);
        }
     System.out.println(lhs);
     Iterator itr=lhs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
    
}
