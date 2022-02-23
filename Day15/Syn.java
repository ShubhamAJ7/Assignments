class First{
	
      synchronized void dispaly(String msg) { //[welcome][tonew][java]//using synchronized method
       
       System.out.print("["+msg);
       
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
       System.out.println("]");
   }
}
class Second extends Thread{
   
   String msg;
   First fobj;//has- a realtion
   
   Second(First fobj,String msg){
       this.fobj=fobj;
       this.msg=msg;
       this.start();	
   }
   
  /* public void run() {
       synchronized(fobj)
       {
       fobj.dispaly(msg);
       }*/
       
   
   public void run() {
   
    fobj.dispaly(msg);
   
}
}
public class Syn {
public static void main(String[] args) {
   
   First fnew= new First();

   Second ss= new Second(fnew, "welcome");
   Second ss1= new Second(fnew, "tonew");
   Second ss2= new Second(fnew, "java");
}
}