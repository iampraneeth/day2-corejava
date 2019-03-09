import java.util.Scanner;
public class EmployeeMain
{
	public static void main(String a[])
	{
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the employee id number");
	double Id=scanner.nextDouble();
	System.out.println("Enter the employee name");
	String name=scanner.next();
	System.out.println("Enter the employee monthly basis");
	double monthlyBasis=scanner.nextDouble();
	
	Employee employee=new Employee(Id,name,monthlyBasis);

	System.out.println("Annual Basis is "+employee.getAnnualBasis());
	System.out.println("Monthly Gross Salary is "+employee.getMonthlyGrossSalary());
	System.out.println("Annual salary is "+employee.annualGrossSalary());
	System.out.println("Monthly deductions is "+employee.monthlyDeductions());
	System.out.println("Monthly takehome "+employee.monthlyTakeHome());
	System.out.println("Annual take home "+employee.annualTakeHome());
	System.out.println("Pf rate is "+employee.pfRate());
	}
	
	
	
}
	
	