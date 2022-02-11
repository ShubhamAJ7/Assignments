abstract class be{
    abstract void addingredients ();   
}
class tea extends be{
    void addmilk()
    {
        System.out.println("Tea");
    }
    void addingredients()
    {
        System.out.println("Ginger");
    }
    
}
class coff extends be{
    void addmilk()
    {
        System.out.println("Coff");
    }
    void addingredients()
    {
        System.out.println("Coffee");
    }
    
}
public class Bev{
    public static void main(String[] args) {
        tea t=new tea();
        t.addmilk();
        t.addingredients();
        ///////////
        coff c=new coff();
        c.addmilk();
        c.addingredients();
    }
}

