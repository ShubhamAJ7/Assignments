class Design extends Thread
{
    public void run()
    {
       System.out.println("a"+Thread.currentThread().getName());

       //System.out.println(Thread.currentThread().getName());

    }
  /*  public String run (int i) ///cant run argument
    {
        System.out.println("Child Thread");
        return "Argument run thread";

    }*/

    //it is not recomnded to overrirde the start method. here if we call start method its like normal methd calling
 //if we override the start method, dont go with multithrading.
  /*  public void start(int i) // in this case on run work
    {
        System.out.println("start ");

    }*/
    
}
/**
 * T1
 */
public class T5 {

    public static void main(String[] args)
     {
         Design mt=new Design();
         //Design mt1=new Design();
         mt.start();//invoke run
         //mt.setName("AJ");
         //mt.start(8);
         System.out.println(Thread.currentThread().getName());
         mt.setName("AJ");
         
         System.out.println("Main Thread");
         
         Thread.currentThread().setName("bvgv");
         System.out.println(Thread.currentThread().getName());
         
         
        
    }
}
