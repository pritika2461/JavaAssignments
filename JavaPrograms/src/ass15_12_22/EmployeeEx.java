package ass15_12_22;

public class EmployeeEx
{
        static int count =0;
        int id;
        String name;
        int salary;
		
		
        EmployeeEx()
            {
                System.out.println("I am default constructor.");
                count++;
             }

       EmployeeEx(int id, String name,int salary)
           {
               System.out.println("I am parameterized constructor.");
               this.id= id;
               this.name= name;
               this.salary= salary;
                count++;
            }


         public String toString()
              { 
                   return id+" "+name+ " "+salary;
               } 

   public static void main(String[] args)
    {
          
          EmployeeEx c1 = new EmployeeEx();

           EmployeeEx c2 =new EmployeeEx(15,"Pritika",50000);
           System.out.println(c2);

       System.out.println("Number of Object : "+count);
    }
}
