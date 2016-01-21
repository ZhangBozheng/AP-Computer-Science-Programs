public class IsoscelesTriangularPrism extends TriangularPrism implements Shape{
	public double width;
	public double height;
	public double length;
	
	public IsoscelesTriangularPrism(double width, double height, double length){
		super(width, height, length);
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public double getSurfaceArea(){
		return (width*height)+(length*width)+(length*height)+(height*Math.sqrt((length*length)+(width*width)));
	}
}