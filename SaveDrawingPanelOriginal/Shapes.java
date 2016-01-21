import java.awt.*;

public class Shapes{
	public static void main(String [] args){
		DrawingPanel square = new DrawingPanel(2000,1000);
		Graphics g = square.getGraphics();
		
		g.setColor(Color.RED);
		g.fillRect(25,25,75,25);
		
		g.setColor(Color.BLUE);
		g.fillOval(150,150,75,25);
		
		g.setColor(Color.MAGENTA);
		g.fillOval(250,250,75,25);
		
		g.setColor(Color.BLACK);
		g.drawRect(25,25,75,25);
		g.drawOval(150,150,75,25);
		g.drawOval(250,250,75,25);
	
	}
}	