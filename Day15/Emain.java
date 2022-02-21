import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Emain  {
   

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empi=1;//employee web id
        int emptempid=1;//use dfor common iput ids for cases
        HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
        System.out.println("Enter  1. Add Employee \n  2. Update Employee \n 3. Delete Employee \n 4. Get Employee \n 5. Getall Employee \n ");
        int i=sc.nextInt();
        int epcode,epcontact;
        String epdep,epname;
        
        while(true)
        {
            switch(i) {
		
                case 1:
                    System.out.println("Enter Employee  Details");
                    System.out.println("Enter Employee Code");
                           epcode=sc.nextInt();
                    System.out.println("Enter Employee Name");
                           epname=sc.next();
                    System.out.println("Enter Employee Department");
                         epdep=sc.next();
                    System.out.println("Enter Employee Contact");
                         epcontact=sc.nextInt();
                    
                         Employee ep= new Employee(epcode, epname, epdep, epcontact);
                     
                     
                     emp.put(empi,ep);
                     
                     System.out.println("Employee addedd succsfully :"+empi);
                     empi++;
                     break;
               case 2:
                   
                   System.out.println("Enter to Update the Employee details");
                   
                   System.out.println("ENTER ID TO UPDATE");
                              emptempid=sc.nextInt();//getiing employee id to update
                              System.out.println("Enter Employee  Details");
                              System.out.println("Enter Employee Code");
                                     epcode=sc.nextInt();
                              System.out.println("Enter Employee Name");
                                     epname=sc.nextLine();
                              System.out.println("Enter Employee Department");
                                   epdep=sc.nextLine();
                              System.out.println("Enter Employee Contact");
                                    epcontact=sc.nextInt();
                              
                                
                            Employee ep1= new Employee(epcode, epname, epdep, epcontact);
                     
                               
                               emp.put(emptempid,ep1);
                               
                               System.out.println("Employee Details Updated succsfully :"+emptempid);
                    break;
               case 3:
                   System.out.println("Enter id to get the Employee details");
                      emptempid=sc.nextInt();//geeting employee id to present
         
                      emp.get(emptempid);///or sysout(Employee.get(emptempid))
                      //System.out.println(ep3);
                      
                    break;
               case 4:
                   Set<Entry<Integer,Employee>> result=emp.entrySet();
                   Iterator<Entry<Integer,Employee>> itr=result.iterator();
                   
                   while(itr.hasNext()) {
                       Entry<Integer,Employee> finalResult=itr.next();
                       
                       System.out.println(finalResult.getKey()+"  "+finalResult.getValue());
                       
                    }
                    break;
               case 5:
                   
                   System.out.println("Enter id to delete Employee");
                   emptempid= sc.nextInt();
                   
                   emp.remove(emptempid);
                   System.out.println("Employee deleted :"+emptempid);
                    
                    break;
                
                
                default:
                    System.out.println("wrong selection.....");
                    
                
                  
                }
                System.out.println("Enter  1. Add Employee \n  2. Update Employee \n 3. Delete Employee \n 4. Get Employee \n 5. Getall Employee \n ");
                i=sc.nextInt();  
                
            }

        }
    }
    
