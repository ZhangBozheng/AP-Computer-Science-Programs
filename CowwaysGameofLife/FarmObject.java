abstract class FarmObject{
	private int x;
	private int y;
	
	public abstract void doStuffForAnHour(int hour);
	
	public void remove(){
		things.remove(indexOf(this));
	}
}