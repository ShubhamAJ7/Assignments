class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Child Thread");

    }
  /*  public String run (int i) ///cant run argument
    {
        System.out.println("Child Thread");
        return "Argument run thread";

    }*/

    //it is not recomnded to overrirde the start method. here if we call start method its like normal methd calling
 //if we override the start method, dont go with multithrading.
    public void start(int i) // in this case on run work
    {
        System.out.println("start ");

    }
    
}
/**
 * T1
 */
public class T1 {

    public static void main(String[] args)
     {
         MyThread mt=new MyThread();
         mt.start();//invoke run
         mt.start(8);
         System.out.println("Main Thread");
        
    }
}
