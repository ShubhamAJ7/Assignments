public class Test1
{
    public static void main(String args[])
    {
        int i=0 ;
        
        String nam = "shubha";
        System.out.println(nam);
        String name[] = {"shubham","shu","sh"};
        //String name[] = {"shubham","shu",45}; not valid use for same type of data but {"shubham","shu","45"} is valid
        for (i=0;i<3;i++)
        {
        System.out.println(name[i]);
        }
        for (String j : name) //for each loop
        {
            System.out.println(j);
        }
    }
}
