class Animal{
    void tes1(){

    
    System.out.println("test 1");
    }
}
public class overe extends Animal
 {
    //@Override
    void tes1()
    {
        System.out.println("test 2");
        }
    public static void main(String[] args) {
        overe t =new overe();

        t.tes1();

    

        
    }
    
}
