public class Test
 {
    public  void test(){
        System.out.println("test");
    }
    public static void main(String args[]){
        Test test = new Test();
        test.test(); 
    }
    public void tst(){
        test();  // no errors
    }
}