import java.util.Scanner;


public class Emp
 {
     public static void main(String[] args) 
     {
         Empl t= new Empl();
         t.id(5);
     }

    
}
class Empl

{   int a;
    //Scanner sc=new Scanner(System.in);
    Empl()
    {
        System.out.println("EMPLOYEE DETAILS");
    }
    int id(int a)
    {
        this.a=a;
        System.out.println("Your id is"+a);
        return a;
    }


}
