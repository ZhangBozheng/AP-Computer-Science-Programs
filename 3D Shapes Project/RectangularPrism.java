public class RectangularPrism extends Prism implements Shape{
	public double length;
	public double width;
	public double height;
	
	public RectangularPrism(double length, double width, double height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double getVolume(){
		return length * width * height;
	}
	
	public double getSurfaceArea(){
		return (2*length*width)+(2*length*height)+(2*width*height);
	}
}