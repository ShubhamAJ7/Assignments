import java.util.Arrays;

public class Average {
    public int agg()
    {
        int sum=0 ,i=0 ;
        int arr [ ] = {1,2,356,66};
        for (i=0;i<4;i++)
        {
            sum=sum + arr[i];

        }
        System.out.println("array to string");
        String str=Arrays.toString(arr);
        System.out.println(str);
        return sum;

    }
    public static void main(String args[])
    {

    
   Average t= new Average();
  
   System.out.println( t.agg ());
  
    }
}
