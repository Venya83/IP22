package not_solid_snake;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
public class snake {

	public static void main(String[] args) {
		myFrame okno = new myFrame();

	}

}
class myFrame extends JFrame 
{
	public myFrame()
	{
		myPanel pan = new myPanel();
		Container cont = getContentPane();
		cont.add(pan);
		setTitle("Not Solid Snake");
		setBounds(0, 0, 800, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}
class myPanel extends JPanel
{
	private myPanel pan;
	private game myGame;
	private Timer tmDraw, tmUpdate;
	private Image bg,body,head,apple,gameover;
	private JLabel lb;
	private JButton btn1,btn2;
	
	private class myKey implements KeyListener
	{
		public void keyPressed(KeyEvent e)
		{
			int key = e.getKeyCode();
			if (key==KeyEvent.VK_LEFT) myGame.new_dir=0;
			else if (key==KeyEvent.VK_UP)myGame.new_dir=1;
			else if (key==KeyEvent.VK_RIGHT)myGame.new_dir=2;
			else if (key==KeyEvent.VK_DOWN)myGame.new_dir=3;
		}
		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
	}

	public myPanel()
	{
		pan = this;
		this.addKeyListener(new myKey());
		this.setFocusable(true);
		try 
		{	
			bg = ImageIO.read(new File("X:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\not_solid_snake\\src\\materials\\bg.png"));
			body = ImageIO.read(new File("X:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\not_solid_snake\\src\\materials\\body.png"));
			head = ImageIO.read(new File("X:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\not_solid_snake\\src\\materials\\head.png"));
			apple = ImageIO.read(new File("X:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\not_solid_snake\\src\\materials\\apple.png"));
			gameover = ImageIO.read(new File("X:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\not_solid_snake\\src\\materials\\end.png"));
		}
		catch (Exception ex) {}
		myGame = new game();
		myGame.start();
		tmDraw = new Timer(20, new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				repaint();
			}
		});
		tmDraw.start();
		tmUpdate = new Timer(80, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (myGame.gameover==false)
				{
					myGame.perem();
				}
				lb.setText("Выпито: " + myGame.quantity + " л.");
			}
		});
		tmUpdate.start();
		setLayout(null);
		lb = new JLabel();
		lb.setForeground(Color.BLACK);
		lb.setFont(new Font("Arial", Font.BOLD, 20));
		lb.setBounds(630,200,150,50);
		add(lb);
		btn1 = new JButton();
		btn1.setText("Новая игра");
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Arial", Font.BOLD,20));
		btn1.setBounds(630,30,150,50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myGame.start();
				btn1.setFocusable(false);
				btn2.setFocusable(false);
				pan.setFocusable(true);
			}
	});
		add(btn1);
		btn2 = new JButton();
		btn2.setText("Выход");
		btn2.setForeground(Color.decode("#fe2330"));
		btn2.setFont(new Font ("Arial",Font.BOLD,20));
		btn2.setBounds(630, 100, 150, 50);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		add(btn2);
	}
	public void paintComponent(Graphics gr)
	{
		super.paintComponent(gr);
		gr.drawImage(bg,0,0,800,650,null);
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				if(myGame.mas[i][j]!=0)
				{
					if(myGame.mas[i][j]==1)
					{
						gr.drawImage(head, 10+j*20, 10+i*20,20,20,null);
					}
					else if (myGame.mas[i][j]==-1)
					{
						gr.drawImage(apple, 10+j*20, 10+i*20,20,20,null);
					}
					else if (myGame.mas[i][j]>=2)
					{
						gr.drawImage(body,10+j*20, 10+i*20,20,20,null);
					}
				}
			}
		}
		gr.setColor(Color.RED);
		for(int i = 0; i <= 30; i++)
		{ 
		}
		if (myGame.gameover==true)
		{
			gr.drawImage(gameover,250,200,200,100,null);
		}
	}
}
