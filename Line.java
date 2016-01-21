public class Line{
	Vect2 a;
	Vect2 b;
	
	public Line(Vect2 c, Vect2 d){
		this.a = c;
		this.b = d;
	}
	
	public Line rotate(double angle, Vect2 center){
		return new Line(this.a.rotate(angle), this.b.rotate(angle));
	}
	public Line translate(Vect2 transform){
		Vect2 e = new Vect2(this.a.x+transform.x,this.a.y+transform.y);
		Vect2 f = new Vect2(this.b.x+transform.x,this.b.y+transform.y);
		return new Line(e,f);
	}
	
	public double length(){
		return Math.sqrt(((this.a.x-this.b.x)*(this.a.x-this.b.x))+((this.a.y-this.b.y)*(this.a.y-this.b.y)));
	}
	
	public String toString(){
		String the = "(("+this.a.x+", "+this.a.y+"), ("+this.b.x+", "+this.b.y+"))";
		return the;
	}
}