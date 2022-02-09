public class def {

    //instance
        boolean val1;
        double val2;
        float val3;
        int val4;
        long val5;
        String val6;
        //static
        static boolean va1;
        static double va2;
        static float va3;
        static int va4;
        static long va5;
        static String va6;
        public static void main(String[] args) {
            // static
                   System.out.println("Default values.....");
                   System.out.println("Val1 = " + va1);
                   System.out.println("Val2 = " + va2);
                   System.out.println("Val3 = " + va3);
                   System.out.println("Val4 = " + va4);
                   System.out.println("Val5 = " + va5);
                   System.out.println("Val6 = " + va6);
                
            //instance
            def t= new def();
        System.out.println("Default values.....");
        System.out.println("Val1 = " + t.val1);
        System.out.println("Val2 = " + t.val2);
        System.out.println("Val3 = " + t.val3);
        System.out.println("Val4 = " + t.val4);
        System.out.println("Val5 = " + t.val5);
        System.out.println("Val6 = " + t.val6);
        }
     
}
