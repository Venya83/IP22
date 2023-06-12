package laalb3;
import javax.swing.*;
public class Chamber1 {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++)
		{
			JFrame nf = new JFrame();
			nf.setBounds(i*100, i*100, i*100, i*100);
			nf.setVisible(true);
		}
	}
}