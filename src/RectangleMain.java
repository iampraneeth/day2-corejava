
class RectangleMain{
		
	public static void main(String a[]){

		
		Rectangle rectangle1=new Rectangle(2,4);
		Rectangle rectangle2=new Rectangle(8,4);
		
		rectangle1.show();
		rectangle2.show();

		if(rectangle1.areaOfRectangle()==rectangle2.areaOfRectangle()){

			System.out.print("Areas are equal ");
		}
		if(rectangle1.perimeterOfRectangle()==rectangle2.perimeterOfRectangle()){

			System.out.print("Areas are equal ");
		}
		
		}
}