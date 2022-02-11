class Veichle{
    private int vecname;
    public int vcname()
    {
        return vecname;
    }
    public void setname(int newname)
    {
        vecname=newname;
    }
}
public class Encap {
    public static void main(String[] args) {
        Veichle t=new Veichle();
        t.setname(55);
        System.out.println(+t.vcname());
    }

    
}
