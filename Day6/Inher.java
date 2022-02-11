class Test1 extends Test2{
    void tes1(){

    
    System.out.println("test 1");
    }
}
class Test2{
    void tes2(){

    
        System.out.println("test 2");
        }
    
}
interface Test3{
    default void tes3(){

    
        System.out.println("test 3");
        }
    
}
interface Test4{
    default void tes4(){

    
        System.out.println("test 4");
        }
    }
    //////////////////////////////
public class Inher implements Test3,Test4 {

      public static void main(String[] args) {
        Inher t=new Inher();
        t.tes3();
        t.tes4();
    }
    
}
