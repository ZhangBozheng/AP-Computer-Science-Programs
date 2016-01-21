public class Sphere implements Shape{
	public double radius;
	
	public Sphere(double radius){
		this.radius = radius;
	}
	
	public double getVolume(){
		return (4/3) * Math.PI * radius * radius * radius;
	}
	
	public double getSurfaceArea(){
		return 4 * Math.PI * radius * radius;
	}
}