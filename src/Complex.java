class Complex
{
	private double real;
	private double imaginary;
	
	public void set(double real,double imaginary)
		{
		this.real=real;
		this.imaginary=imaginary;
		}
	
	public void display()
		{
		System.out.println(" The Complex Number is "+real+" + "+imaginary+" i");
		
	
		}
	public void sum(Complex complex1,Complex complex2)
		{
			
		
		System.out.println(" The sum is "+ (complex1.real+complex2.real) + " + "+ (complex1.imaginary+complex2.imaginary) +" i ");

		}
	
	
}
		