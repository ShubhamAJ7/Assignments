import java.util.Scanner;
public class Fii{

    public static void main(String[] args) 
    {
        Student s1=new Student();  
        System.out.println(s1.roll());
        
        Student S2 = new Student("Shikhar");
 
        // Invoke the constructor with two arguments
        Student S3 = new Student("Dharmesh", 26);
 
        // Invoke the constructor with one argument of
        // type 'Long'.
        Student S4 = new Student(325614567);
       
    }
    
    
}
class Student
{
    static Scanner sc=new Scanner(System.in);
    Student()
    {
        System.out.println("Constructor Defaault");
        System.out.println("enter your class");
        int a=sc.nextInt();
        System.out.println(a);
    }
       
    Student(String name)
    {
        System.out.println("Constructor with one " +
                      "argument - String : " + name);
    }
 
    // constructor with two arguments
    Student(String name, int age)
    {
 
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
 
    }
 
    // Constructor with one argument but with different
    // type than previous..
    Student(long id)
    {
        System.out.println("Constructor with one argument : " +
                                            "Long : " + id);
    }
    public static int roll()
    {
        System.out.println("Constructor Defaault");
        System.out.println("enter your roll");
        int b=sc.nextInt();
        return b;
    }
       
}
