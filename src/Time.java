class Time{
	private int hours;
	private int minutes;

	public int setTime(int hours,int minutes){
		this.hours=hours;
		this.minutes=minutes;
		return 0;
	}
	
	public int showTime(){
		System.out.println("The Time is "+this.hours+" Hours :"+this.minutes+" Minutes");
		return 0;
	}
	
	public Time timeSum(Time time2){
		Time t4=new Time();
		t4.hours=this.hours+time2.hours;
		t4.minutes=this.minutes+time2.minutes;
		if(t4.minutes>=60){
			t4.minutes=t4.minutes-60;
			
			t4.hours=t4.hours+1;
			
		}
		return t4;
	}
}
	