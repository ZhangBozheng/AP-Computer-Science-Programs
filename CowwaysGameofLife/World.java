import java.util.*;

public class World{
	private int hour = 0;
	List<Farm> farms = new ArrayList<Farm>();
	
	public World(int hour){
		this.hour = hour;
	}
	
	public void incrementHour(){
		this.hour = this.hour + 1;
	}
	
	public void addFarm(Farm farm) {
		this.farms.add(farm);
	}
	
	public List<Farm> getFarms() {
		return this.farms;
	}
}
		