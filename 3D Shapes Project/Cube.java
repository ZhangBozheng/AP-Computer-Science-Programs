public class Cube implements Shape{
	public double length;

	public Cube(double length){
		this.length = length;
	}
	
	public double getVolume(){
		return length * length * length;
	}
	
	public double getSurfaceArea(){
		return 6 * length * length;
	}
}