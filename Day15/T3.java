/*class Demine implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread");

    }
}*/
//Using the Thread Class

public class T3 {
    public static void main(String[] args)
     {
        // Demine d1=new Demine();
         Thread t1 =new Thread("Hii guys");//Using constructor thread
         //t1.start();
         String str= t1.getName();
         System.out.println(str);


    }
    
}