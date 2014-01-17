import javax.swing.*;
import java.awt.*;

public class simpleFrameTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					//SimpleFrame frame = new SimpleFrame();
					NotHelloWorldFrame frame = new NotHelloWorldFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			});
	}
}

class SimpleFrame extends JFrame
{
	public SimpleFrame()
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		setLocationByPlatform(true);
//		setLocation(40,40);
		setSize(screenWidth / 2, screenHeight / 2);
		//setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setResizable(true);
		Image img = kit.getImage("baidu_jgylogo3.gif");
		setIconImage(img);
		setTitle("shanpao");
	}
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 400;
}

class NotHelloWorldFrame extends JFrame
{
	public NotHelloWorldFrame()
	{	
		setTitle("not hello world");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		NotHelloWorldPanel panel = new NotHelloWorldPanel();
		add(panel);
	}
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 400;
}

class NotHelloWorldPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.drawString("not a hello world program", MESSAGE_X, MESSAGE_Y);
	}
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;

}
