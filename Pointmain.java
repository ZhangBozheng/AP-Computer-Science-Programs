public class Pointmain{
	public static void main(String[] args){
		Point p1 = new Point();
		p1.x = 6;
		p1.y = 8;
		Point p2 = new Point(2,3);
		System.out.println(p1);
		System.out.println(p1.distanceFromOrigin());
		System.out.println(p2);
	}
}