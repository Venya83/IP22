package not_solid_snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class game {
	public int[][] mas;
	public int dir;
	private int gX, gY;
	public int quantity;
	public int new_dir;
	private int length;
	protected boolean gameover;
	private void povorot()
	{
		if (Math.abs((new_dir-dir))!=2)
		{
			dir=new_dir;
		}
	}
	public game()
	{
		mas=new int[30][30];
	}
	private void make_new()
	{
		while(true)
		{
			int x = (int)(Math.random()*30);
			int y = (int)(Math.random()*30);
			if (mas[y][x]==0)
			{
				mas[y][x]=-1;
				break;
			}
		}
	}
	public void start()
	{
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				mas[i][j] = 0;
			}
		}
		dir = 0;
		quantity = 0;
		mas[14][14]=1;
		mas[14][15]=2;
		mas[14][16]=3;
		length = 3;
		gX=gY=14;
		gameover=false;
		make_new();
	}
	public int peremGolova()
	{
		if (dir==0)
		{
			if ((gX-1)>=0)
				gX--;
			else 
				gX=29;
		}
		else if (dir==1)
		{
			if ((gY-1)>=0)
				gY--;
			else 
				gY=29;
		}
		else if (dir==2)
		{
			if((gX+1)<=29)
				gX++;
			else 
				gX=0;
		}
		else if(dir==3)
		{
			if((gY+1)<=29)
				gY++;
			else 
				gY=0;
		}
		if (mas[gY][gX]==-10)
		{
			make_new();
			quantity+=10;
		}
		
		int rez=0;
		if (mas[gY][gX]==-1)rez=1;;
		if (mas[gY][gX]==0)rez=2;
		if (mas[gY][gX]>0)rez=3;
		mas[gY][gX]=-2;
		return rez;
	}
		public void perem() {
			int flag=peremGolova();
			if (flag==3)gameover=true;
			for(int i=0; i<30; i++)
			{
				for(int j=0; j<30; j++)
				{
					if(mas[i][j]>0)mas[i][j]++;
					else if (mas[i][j]==-2)mas[i][j]=1;
					if(flag!=1)
					{
						if(mas[i][j]==(length+1))mas[i][j]=0;
					}
				}
			}
			if (flag==1)
			{
				length++;
				make_new();
				quantity+=1;
			}
			povorot();
	}
}
