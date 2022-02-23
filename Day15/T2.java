class Demine implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread");

    }
}
public class T2 {
    public static void main(String[] args)
     {
         Demine d1=new Demine();
         Thread t1 =new Thread(d1);//Using constructor thread
         t1.start();


    }
    
}
