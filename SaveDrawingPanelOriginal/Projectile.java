import java.awt.*;
import java.util.*;

public class Projectile{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter start angle: ");
		int startangle = console.nextInt();
		System.out.println("Enter final angle: ");
		int finalangle = console.nextInt();
		System.out.println("Enter increment: ");
		int increment = console.nextInt();
		System.out.println();
		
		trajectory(startangle, finalangle, increment);
	}
	
	public static void trajectory(int startangle, int finalangle, int increment){
		DrawingPanel square = new DrawingPanel(100,50);
		Graphics g = square.getGraphics();
		g.setColor(Color.BLACK);
		
		double startanglerad = Math.toRadians(startangle);
		double finalanglerad = Math.toRadians(finalangle);
		double incrementrad = Math.toRadians(increment);
		
		for(double i = startanglerad; i<=finalanglerad; i = i + incrementrad){
			for(double t = 0; t<= (60*Math.sin(i)/9.81); t=t+0.5){
				double x = 30*Math.cos(i)*t;
				double y = 30*Math.sin(i)*t - 0.5*9.81*(t*t);
				g.fillOval((int)x+1,50-(int)y+1,2,2);
				double rangex = (30* Math.cos(i))*(60*Math.sin(i)/9.81);
				g.fillOval((int) rangex+1,48,2,2);
			}
		}
	}
}	