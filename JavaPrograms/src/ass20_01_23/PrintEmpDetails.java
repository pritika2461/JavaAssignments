package ass20_01_23;

public class PrintEmpDetails {

	public static void main(String[] args)
	{
		EmpDetails e = new EmpDetails();
		e.emp();
		
		System.out.println();
		System.out.println("** Employee Details **");
		System.out.println("Id : "+e.id);
		System.out.println("Name : "+e.name);
		System.out.println("Salary : "+e.sal);
		System.out.println("Designation : "+e.designation);


	}
	

}
