import javax.swing.*;
import java.awt.*;

public class PlayPong extends JFrame
{
	public PlayPong()
	{
		getContentPane().setLayout(new FlowLayout());
		add(new PongComponent());
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		System.out.println("Testing");
	}

	public static void main(String[] args)
	{
		new PlayPong();
	}
}