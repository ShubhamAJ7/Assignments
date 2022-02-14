import java.util.ArrayList;
import java.util.ListIterator;

public class Listitr {
    public static void main(String[] args) {
        ArrayList <String> al=new ArrayList();
        al.add("hii");
        al.add("by");
        al.add("jain");

        System.out.println(al);
        ListIterator Litr=al.listIterator();
        System.out.println(Litr);
        while(Litr.hasNext())
        {
            System.out.println(Litr.next()) ;
        }
        
        
        System.out.println("reverse direction");
        
        while (Litr.hasPrevious())
        {
            System.out.println(Litr.previous());
        }
        

    }
}
    
