import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				ButtonFrame frame = new ButtonFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class ButtonFrame extends JFrame
{
	public ButtonFrame()
	{
		setTitle("Button Test");
		setSize(300, 200);
		
		JButton yellowButton = new JButton("yellow");
		JButton blueButton = new JButton("blue");
		JButton redButton = new JButton("red");
		
		buttonPanel = new JPanel();
		
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);
		
		add(buttonPanel);
		
		ColorAction yellowAction = new ColorAction(Color.YELLOW);
		ColorAction blueAction = new ColorAction(Color.BLUE);
		ColorAction redAction = new ColorAction(Color.RED);
		
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
	}


	private class ColorAction implements ActionListener
	{
		public ColorAction(Color c)
		{
			backgroundColor = c;
		}
		
		public void actionPerformed(ActionEvent event)
		{
			buttonPanel.setBackground(backgroundColor);
		}
		
		private Color backgroundColor;
		
	}
	private JPanel buttonPanel;
}