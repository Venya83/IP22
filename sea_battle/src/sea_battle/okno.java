package sea_battle;

import java.awt.*;
import javax.swing.*;
public class okno extends JFrame{
	public okno() {
		pole pan = new pole();
		Container cont = getContentPane();
		cont.add(pan);
		setTitle("Восточные морские шахматы");
		setBounds(0,0,900,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

}
