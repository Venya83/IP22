package sea_battle;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
public class pole extends JPanel{
	private Timer tmDraw;
	private Image fon,paluba,ubit,ranen,end1,end2,bomba;
	private JLabel Ib, Ib1;
	private JButton btn1,btn2;
	private game myGame;
	private int mX, mY;
	public class myMouse1 implements MouseListener {
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {
			if ((e.getButton()==1)&&(e.getClickCount()==1)) {
				mX = e.getX();
				mY = e.getY();
				if ((mX > 100)&&(mY > 100)&&(mX < 400)&&(mY < 400)) {
					if ((myGame.endg==0)&&(myGame.compHod==false)) {
						int i = (mY-100)/30;
						int j = (mX-100)/30;
						if (myGame.masComp[i][j]<=4) myGame.vistrelPlay(i, j);
					}
				}
			}
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public class myMouse2 implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {}
		public void mouseMoved(MouseEvent e) {
			mX = e.getX();
			mY = e.getY();
			if ((mX >= 100)&&(mY >= 100)&&(mX <= 400)&&(mY <= 400)) {
				setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			}
			else {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		}
	}
	public pole() {
		addMouseListener(new myMouse1());
		addMouseMotionListener(new myMouse2());
		setFocusable(true);
		myGame = new game();
		myGame.start();
		try {
			fon = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\sea_battle\\src\\materials\\bg.png"));
			paluba = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\sea_battle\\src\\materials\\cirno.png"));
			ranen = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\sea_battle\\src\\materials\\cirno_red.png"));	
			ubit = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\sea_battle\\src\\materials\\P.png"));
			end1 = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\Попова\\ИП22\\Zubkovskiy Jotaro\\белые кораблики , мясо, взрывы\\Картинки морской бой\\end1.png"));
			end2 = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\Попова\\ИП22\\Zubkovskiy Jotaro\\белые кораблики , мясо, взрывы\\Картинки морской бой\\end2.png"));
			bomba = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\sea_battle\\src\\materials\\red.png"));
		}
		catch (Exception ex) {}
		tmDraw = new Timer(50,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				repaint();
				Ib.setText("Осталось:"+myGame.kol+"/20");
				Ib1.setText("Осталось:"+myGame.kol1+"/20");
			}
		});
		tmDraw.start();
		setLayout(null);
		
		Ib=new JLabel("осталось:20");
		Ib.setForeground(Color.WHITE);
		Ib.setFont(new Font("Consolas",0,20));
		Ib.setBounds(245,400,180,60);
		add(Ib);
		Ib1=new JLabel("осталось:20");
		Ib1.setForeground(Color.WHITE);
		Ib1.setFont(new Font("Consolas",0,20));
		Ib1.setBounds(500,400,180,60);
		add(Ib1);
		btn1 = new JButton();
		btn1.setText("Этой кнопки нет");
		btn1.setForeground(Color.BLUE);
		btn1.setFont(new Font("serif",0,20));
		btn1.setBounds(130,450,200,80);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myGame.start();
			}
		});
		
		btn1 = new JButton();
		btn1.setText("ПО НОВОЙ");
		btn1.setForeground(Color.BLUE);
		btn1.setFont(new Font("Consolas",1,20));
		btn1.setBounds(130,450,200,80);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myGame.start();
			}
		});
		add(btn1);
		btn2 = new JButton();
		btn2.setText("Я ЛИВАЮ");
		btn2.setForeground(Color.RED);
		btn2.setFont(new Font("Consolas",1,25));
		btn2.setBounds(530,450,200,80);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		add(btn2);
	}
	public void paintComponent(Graphics gr) {
		super.paintComponent(gr);
		gr.drawImage(fon, 0, 0, 900, 600, null);
		gr.setFont(new Font("Consolas",1,40));
		gr.setColor(Color.black);
		for (int i = 0; i <= 10; i++) {
			gr.drawLine(100+i*30, 100, 100+i*30, 400);
			gr.drawLine(100, 100+i*30, 400, 100+i*30);
			gr.drawLine(500+i*30, 100, 500+i*30, 400);
			gr.drawLine(500, 100+i*30, 800, 100+i*30);
		}
		gr.drawString("ТЫ", 150, 50);
		gr.drawString("ОН", 590, 50);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (myGame.masComp[i][j]!=0) {
					if ((myGame.masComp[i][j]>=8)&&(myGame.masComp[i][j]<=11)) {
						gr.drawImage(ranen, 100+j*30, 100+i*30, 30, 30, null);
					}
					else if (myGame.masComp[i][j]>=15) {
						gr.drawImage(ubit, 100+j*30, 100+i*30, 30, 30, null);
					}
					if (myGame.masComp[i][j]>=5) {
						gr.drawImage(bomba, 100+j*30, 100+i*30, 30, 30, null);
					}
				}
				if (myGame.masPlay[i][j]!=0) {
					if ((myGame.masPlay[i][j]>=1)&&(myGame.masPlay[i][j]<=4)) {
						gr.drawImage(paluba, 500+j*30, 100+i*30, 30, 30, null);
					}
					else if ((myGame.masPlay[i][j]>=8)&&(myGame.masPlay[i][j]<=11)) {
						gr.drawImage(ranen, 500+j*30, 100+i*30, 30, 30, null);
					}
					else if (myGame.masPlay[i][j]>=15) {
						gr.drawImage(ubit, 500+j*30, 100+i*30, 30, 30, null);
					}
					if (myGame.masPlay[i][j]>=5) {
						gr.drawImage(bomba, 500+j*30, 100+i*30, 30, 30, null);
					}
				}
			}
		}
		gr.setFont(new Font("Consolas",0,20));
		gr.setColor(Color.darkGray);
		for (int i = 1; i <= 10; i++) {
			gr.drawString(""+i,73,93+i*30);
			gr.drawString(""+i,473,93+i*30);
			gr.drawString(""+(char)('A'+i-1),78+i*30,93);
			gr.drawString(""+(char)('A'+i-1),478+i*30,93);
		}
		gr.setColor(Color.RED);
		if ((mX > 100)&&(mY > 100)&&(mX < 400)&&(mY < 400)) {
			if ((myGame.endg==0)&&(myGame.compHod==false)) {
				int i = (mY-100)/30;
				int j = (mX-100)/30;
				if (myGame.masComp[i][j]<=4) {
					gr.fillRect(100+j*30, 100+i*30, 30, 30);
				}
			}
		}
		if (myGame.endg==1) {
			gr.drawImage(end1, 300, 200, 300, 100, null);
		}
		if (myGame.endg==2) {
			gr.drawImage(end2, 300, 200, 300, 100, null);
		}
	}
}
