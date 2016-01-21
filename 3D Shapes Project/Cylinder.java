public class Cylinder extends Circle implements Shape{
	public double radius;
	public double height;
	
	public Cylinder(double radius, double height){
		this.radius = radius;
		this.height = height;
	}
	public double getVolume(){
		return Math.PI * radius * radius * height;
	}
	
	public double getSurfaceArea(){
		return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
	}
}