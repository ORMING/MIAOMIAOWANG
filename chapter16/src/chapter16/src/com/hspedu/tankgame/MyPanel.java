package chapter16.src.com.hspedu.tankgame;

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JPanel;

//坦克大戰的繪圖區域
public class MyPanel extends JPanel{
	//定義我的坦克
	Hero hero = null;
	public MyPanel() {
		hero = new Hero(100, 100);//初始化自己坦克
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO 自动生成的方法存根
		super.paint(g);
		g.fillRect(0,0,1000,750);//填充矩形,默認黑色
		//畫出坦克-封裝方法
		drawTank(hero.getX(),hero.getY(),g,0,0);
		drawTank(hero.getX() + 60,hero.getY(),g,0,1);
	}
	
	//編寫方法,畫出坦克
	/*
	 * x 坦克左上角的x坐標
	 * y 坦克左上角的y坐標
	 * g 畫筆
	 * direct 坦克方向
	 * type 坦克類型
	 */
	public void drawTank(int x, int y,Graphics g,int direct, int type) {
		// TODO 自动生成的方法存根
		
		switch(type) {
			case 0: //我們的坦克
				g.setColor(Color.cyan);
				break;
			case 1: //敵人的坦克
				g.setColor(Color.yellow);
				break;
		}
		
		//根據坦克方向來繪製坦克
		switch (direct) {
		case 0://表示向上
			g.fill3DRect(x, y, 10, 60, false);//畫出坦克左邊的輪子
			g.fill3DRect(x + 30, y, 10, 60, false);//畫出坦克右邊的輪子
			g.fill3DRect(x + 10, y + 10, 20, 40, false);//畫出坦克右邊的輪子
			g.fillOval(x + 10, y + 20, 20, 20);//畫出蓋子
			g.drawLine(x + 20, y + 30, x + 20, y);//畫出炮筒
			break;
			
		default:
			System.out.println("暫時沒有處理");
		}
	}

}
