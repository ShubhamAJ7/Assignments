public class Employee {
    private int empcode;
    private String empname;
    private String empdep;
    private int empcontact;
    
    public Employee(int empcode,String empname,String empdep,int empcontact)
    {
        super();
        this.empcode=empcode;
        this.empname=empname;
        this.empdep=empdep;
        this.empcontact=empcontact;
    }
    public String toString()
    {
      return "EMPLOYEE DETAILS\n" +"Name\n" +empname +"Code\n" +empcode +"Department\n" +empdep +"Contact\n" +empcontact;
    }

}
