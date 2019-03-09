import java.util.Scanner;
public class Employee
{	
	private double Id;
	private String name;
	private double monthlyBasis;
	private double medical=1250;
	private double conveyance=800;
	private double Hra;
	private double pf;
	private double esic;
	private double profTax;
	
	public Employee(double Id,String name,double monthlyBasis)
	{
	 
	this.Id=Id;
	this.name=name;
	this.monthlyBasis=monthlyBasis;
	
	
	
	}
	
	public double getAnnualBasis()
	{
		return 12*(monthlyBasis);
	}

	public double getMonthlyGrossSalary()
	{	
		Hra=monthlyBasis/2;
		
		return (monthlyBasis+Hra+medical+conveyance);
	}
	
	public double annualGrossSalary()
	{
		return 12*getMonthlyGrossSalary();
	}
	
	public double monthlyDeductions()
	{
		if(monthlyBasis/10 < 6500)
		{
			pf=6500;
		}
		else 
		{
			pf=monthlyBasis/10;	
		}
		if(monthlyBasis<=5000)
		{
			esic=monthlyBasis/4.75;
		}	
		if(getMonthlyGrossSalary()<=10000)
		{
			profTax=50;
		}
		else if(getMonthlyGrossSalary()>10000)
		{
			profTax=100;
		}
		return pf+esic+profTax;
		
	}
	public double monthlyTakeHome()
	{
		return getMonthlyGrossSalary()-monthlyDeductions();
	}
	
	public double annualTakeHome()
	{
		return 12*monthlyTakeHome();
	}

	public double pfRate()
	{
	       return 10;
	}
	
	
}
	
	