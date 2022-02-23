class Desig extends Thread
{
    public void run()
    {
       System.out.println("a"+Thread.currentThread().getPriority());

       //System.out.println(Thread.currentThread().getName());

    }
}
public class T6 {
    public static void main(String[] args) {
        Desig mt=new Desig();
         mt.start();//invoke run


         mt.setPriority(5);
         
         System.out.println("Main Thread");
         System.out.println(Thread.currentThread().getPriority());
         Thread.currentThread().setPriority(8);;
         System.out.println(Thread.currentThread().getPriority());
         
         
        
    }

    
}
