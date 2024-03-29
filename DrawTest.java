import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					DrawFrame frame = new DrawFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			});
	}
}

class DrawFrame extends JFrame
{
	public DrawFrame()
	{
		setTitle("DrawTest");
		setSize(400, 400);
		 
		DrawComponent component = new DrawComponent();
		add(component);
	}
}

class DrawComponent extends JComponent
{
	public void printComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;

		double leftX=100;
		double leftY=100;
		double height = 200;
		double width = 150;

		Rectangle2D rect = new Rectangle2D.Double(leftX, leftY, width, height);
		g2.draw(rect);

		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);

		g2.draw(new Line2D.Double(leftX, leftY, leftX+width, leftY+height));

		double centerX = rect.getCenterX();
		double centerY = rect.getCenterY();
		double radius = 150;

		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX+radius, centerY+radius);
		g2.draw(circle);
	}
}
