public class ShapesMain{
	public static void main(String[] args){
		Shape[] shapes = new Shape[7];
		shapes[0] = new Cube(9);
		shapes[1] = new Sphere(6);
		shapes[2] = new RectangularPrism(4,5,6);
		shapes[3] = new RightTriangularPrism(3,4,5);
		shapes[4] = new IsoscelesTriangularPrism(3,3,6);
		shapes[5] = new Cylinder(3,6);
		shapes[6] = new Cone(3,6);
		
		for(int i = 0; i<shapes.length; i++){
			System.out.println("Volume = "+shapes[i].getVolume()+ ", Surface Area = "+ shapes[i].getSurfaceArea());
		}
	}
}
		