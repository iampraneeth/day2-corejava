class Distance{
	double inches;
	int feet;



	public void setFeet(int feet){
	
		this.feet = feet;
	}
	public void setInches(double inches){
		this.inches = inches; 
		}
	public void display(){
		System.out.println("Feet= "+this.feet);
		System.out.println("inches= "+this.inches);
		}
	public Distance add(Distance distance2){
		Distance distance4=new Distance();
		distance4.feet=this.feet+distance2.feet;
		distance4.inches=this.inches+distance2.inches;
		if(distance4.inches>=12)
		{
			distance4.feet=distance4.feet+1;
			distance4.inches=distance4.inches-12;
			
		}
		return distance4;
	}
}