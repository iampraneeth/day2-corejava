class TelevisionMain{
	public static void main(String a[]){
		
		Television t1=new Television("ON",18,100);
		t1.state();
		t1.currentVolume();
		t1.channel();
		t1.increaseVolume();
		t1.decreasedVolume();
		t1.increaseChannelChange();
		t1.decreaseChannelChange();
		t1.changeState();
	}
}