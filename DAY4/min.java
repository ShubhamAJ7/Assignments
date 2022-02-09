public class min {
    public static void main(String args[])
    {
        int i,c;
        int arr[]={54,5,6,6,5,6,67,6,6};
        c=arr[0];
        for (i=0;i<arr.length;i++)
        {
            if(c>arr[i])
            {
                c=arr[i];

            }
            

        }
        System.out.println("Minimum:"+c);
    }
    
}
