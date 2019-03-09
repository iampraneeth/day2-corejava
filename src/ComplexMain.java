class ComplexMain{
	public static void main(String a[]){
		
		Complex complex1 = new Complex();
		complex1.set(4,3);
		
		Complex complex2 = new Complex();
		complex2.set(10,5);

		complex1.display();
		complex2.display();
		
		
		
		Complex complex3=new Complex();
		complex3.sum(complex1,complex2);
		
}
}