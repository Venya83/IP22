package laalb3;
import java.awt.*;
import javax.swing.*;


public class Chamber3 {

	public static void main(String[] args) {
		
		myFrame okno = new myFrame();
		
	}

}
class myFrame extends JFrame 
{
	public myFrame()
	{
		myPanel panel = new myPanel();
		Container cont = getContentPane();
		cont.add(panel);
		setBounds(10, 10, 300, 400);
		setVisible(true);
	}
}
class myPanel extends JPanel
{
	public void paintComponent(Graphics gr)
	{
		super.paintComponent(gr);
		gr.setColor (Color.GREEN);
		gr.fillRect(10, 10, 200, 300);
	}
}
