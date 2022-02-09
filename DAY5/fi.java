import java.util.*;  
public class fi 
{
    public static void main(String[] args) 
    {
        int x,y,z;
        char a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("enter two values x and y length nad breath");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("enter two char a and b");
        a=sc.next().charAt(0);
        b=sc.next().charAt(0);
        System.out.println(a);
        System.out.println(b); 

        z=x+y;
        x=z-x;
        y=z-x;
        
        System.out.println(x);
        System.out.println(y); 
        z=x*y;
        System.out.println("area of rectangle  " +z); 

        
    }
    
}

//////////////////////////// add two number
