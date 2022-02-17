import java.util.Scanner;

public class E1 {
    void div(int a,int b)
    {
          a=a/b;
          System.out.println(a);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        E1 e=new E1();
        int x=6;
        int y =0;
        try
        {
            
            e.div(x, y);
            //System.out.println(z);
        }
        catch(Throwable ae)
        {
            System.out.println("Denominator cant be zero");
            System.out.println("enter new value of x and y");
            x=sc.nextInt();
            y=sc.nextInt();
          

        }
        finally
        {
            System.out.println("error over");
        }




    }
    
}
