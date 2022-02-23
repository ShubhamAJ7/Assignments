//Using the Thread Class: Thread(String Name)
class Demine implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread");

    }
}
public class T4 {
    public static void main(String[] args)
     {
         Demine d1=new Demine();
         Thread t1 =new Thread(d1,"thread");//Using constructor thread
         t1.start();
         String str = t1.getName();  
          System.out.println(str);


    }
    
}

