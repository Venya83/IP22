package laalb3;
import javax.swing.*;
import java.awt.*;



public class Chamber5 {
	public static void main(String[] args) {
		myFrame okno = new myFrame();
	}
}

class myFrame extends JFrame
{
	public myFrame()
	{
		myPanel np = new myPanel();
		Container cont = getContentPane();
		cont.add(np);
		setBounds(10, 10, 800, 600);
		setVisible(true);
	}
}
class myPanel extends JPanel
{
	public void paintComponent(Graphics gr)
	{
		gr.setColor(Color.BLUE);
		gr.drawRect(10, 10, 300, 400);
		
		gr.setColor(Color.RED);
		gr.fillOval(100, 100, 500, 500);
	}
}