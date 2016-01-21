public class TriangularPrism extends Prism implements Shape{
	public double width;
	public double height;
	public double length;
	
	public TriangularPrism(double width, double height, double length){
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public double getVolume(){
		return 0.5*length*width*height;
	}
	
	public double getSurfaceArea(){
		return (width*height)+(length*width)+(length*height)+(height*Math.sqrt((length*length)+(width*width)));
	}
}