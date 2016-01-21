import java.awt.*;

public class DrawLine{
	public static void main(String[] args){
	// Create the Drawing Panel
		DrawingPanel panel = new DrawingPanel(200,100);
		//Draw a line on the panel
		Graphics g = panel.getGraphics();
		g.drawLine (25,75,175,25);
	}
}	