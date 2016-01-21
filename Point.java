public class Point{
	int x;
	int y;
	public Point(int initialx, int initialy){
		x = initialx;
		y = initialy;
	}
	public Point(){
		x = this.x;
		y = this.y;
	}
	public double distanceFromOrigin(){
		return Math.sqrt(x*x+y*y);
	}
}