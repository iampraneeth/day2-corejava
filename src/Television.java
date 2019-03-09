class Television{

	
	private String state;
	private int currentVolume;
	private int channel;


	 public Television(String state,int currentVolume,int channel){

		this.state=state;
		this.currentVolume=currentVolume;
		this.channel=channel;
		}
	public void state(){
		System.out.println("The state of channel is "+(this.state));
	}
	public void currentVolume(){
		System.out.println("The current volume is "+(this.currentVolume));
	}
	public void channel(){
		System.out.println("The current channel is "+(this.channel));
	}
	
	public void increaseVolume(){
		System.out.println("The Increased volume is "+(++currentVolume));
	}

	public void decreasedVolume(){
		System.out.println("The Decreased volume is "+(--currentVolume));
	}
	public void increaseChannelChange(){
		System.out.println("Change the channel"+(channel++));
	}
	public void decreaseChannelChange(){
		System.out.println("Change the channel"+(channel--));
	}
	public void changeState(){
		
		System.out.println("Changing the state to OFF");
		
		}
}
	