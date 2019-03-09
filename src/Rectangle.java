
class Rectangle{
	private double lengthOfRectangle;
	private double widthOfRectangle;
		
	public Rectangle(double lengthOfRectangle,double widthOfRectangle){

		this.lengthOfRectangle=lengthOfRectangle;
		this.widthOfRectangle=widthOfRectangle;

		}

	public double areaOfRectangle()
	{
		return widthOfRectangle*lengthOfRectangle;
	}
	public double perimeterOfRectangle()
	{
		return 2*(widthOfRectangle+lengthOfRectangle);
	}
	public void show()
	{
		System.out.println("Area of rectangle is "+areaOfRectangle());
		System.out.println("perimeter of rectangle is "+perimeterOfRectangle());
	}
}		