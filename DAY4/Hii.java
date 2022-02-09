import java.util.Scanner;
public class Hii {

    public static void main(String[] args) {
        
    
    
        Student s1=new Student();  
        Student s2=new Student();     
        System.out.println(s1.cl());
        System.out.println(s2.rl());
        System.out.println(s2.cl());
        System.out.println(s1.rl());
        
    }
    
    
}
class Student
{
    Scanner sc=new Scanner(System.in);
    int cl()
    {
        System.out.println("enter your class");
        int a=sc.nextInt();
        return a;
     
    }
    int rl()
    {
        System.out.println("enter your rollno");
        int b=sc.nextInt();
        return b;
     
    }
}


