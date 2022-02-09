import java.util.*;
public class Circ 
{
    public static void main(String args[])
    {
        peri t = new peri();
        t.cir();
        System.out.println("primeter" +(t.per()));
        System.out.println("primeter" +(t.are()));
        

    }
    
    
}

class peri
    {
        
        int r ;
        double p,a;
        Scanner sc=new Scanner(System.in);
        void cir()
        {
            System.out.println("enter radius");
            r=sc.nextInt();

        }
        double per ()
        {
           p=2*3.14*r ;
           return p ;
        }
        double are ()
        {
           a=3.14*r*r ;
           return a ;
        }

    
}