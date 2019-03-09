class TimeMain{
	public static void main(String a[]){
		
		Time time1=new Time();
		time1.setTime(06,30);
		
		
		Time time2=new Time();
		time2.setTime(12,30);
		
		
		time1.showTime();
		time2.showTime();
		
		Time time3;
		time3=time1.timeSum(time2);
		time3.showTime();
}
}	
		
		