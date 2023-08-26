package chapter18.com.hspedu.tankgame3;

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.event.MenuKeyEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//坦克大戰的繪圖區域

//爲了監聽鍵盤事件我們要實現KeyListener
public class MyPanel extends JPanel implements KeyListener{
	//定義我的坦克
	Hero hero = null;
	//定義敵人坦克放入到vector中
	Vector<EnemyTank> enemyTanks = new Vector<EnemyTank>();
	int enemyTankSize = 3;
	public MyPanel() {
		hero = new Hero(100, 100);//初始化自己坦克
		//初始化敵人坦克
		for (int i = 0; i < enemyTankSize; i++) {
			EnemyTank enemyTank = new EnemyTank(100 * (i+1), 0);
			enemyTank.setDirect(2);
			enemyTanks.add(enemyTank);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO 自动生成的方法存根
		super.paint(g);
		g.fillRect(0,0,1000,750);//填充矩形,默認黑色
		//畫出坦克-封裝方法
		drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);
		//畫出敵人的坦克
		for (int i = 0; i < enemyTankSize; i++) {
			//取出坦克
			EnemyTank enemyTank = enemyTanks.get(i);
			drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
		}
//		drawTank(hero.getX() + 60,hero.getY(),g,0,1);
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
			case 0: //敵人的坦克
				g.setColor(Color.cyan);
				break;
			case 1: //我們的坦克
				g.setColor(Color.yellow);
				break;
		}
		
		//根據坦克方向來繪製對應形狀坦克
		//direct 表示方向(0向上,1向右,2向下,3向左
		//
		switch (direct) {
		case 0://表示向上
			g.fill3DRect(x, y, 10, 60, false);//畫出坦克左邊的輪子
			g.fill3DRect(x + 30, y, 10, 60, false);//畫出坦克右邊的輪子
			g.fill3DRect(x + 10, y + 10, 20, 40, false);//畫出坦克右邊的輪子
			g.fillOval(x + 10, y + 20, 20, 20);//畫出蓋子
			g.drawLine(x + 20, y + 30, x + 20, y);//畫出炮筒
			break;
			
		case 1://表示向右
			g.fill3DRect(x, y, 60, 10, false);//畫出坦克上面的輪子
			g.fill3DRect(x, y + 30, 60, 10, false);//畫出坦克下面的輪子
			g.fill3DRect(x + 10, y + 10, 40, 20, false);//畫出坦克右邊的輪子
			g.fillOval(x + 20, y + 10, 20, 20);//畫出蓋子
			g.drawLine(x + 30, y + 20, x + 60, y + 20);//畫出炮筒
			break;
		
		case 2://表示向下
			g.fill3DRect(x, y, 10, 60, false);//畫出坦克左邊的輪子
			g.fill3DRect(x + 30, y, 10, 60, false);//畫出坦克右邊的輪子
			g.fill3DRect(x + 10, y + 10, 20, 40, false);//畫出坦克右邊的輪子
			g.fillOval(x + 10, y + 20, 20, 20);//畫出蓋子
			g.drawLine(x + 20, y + 30, x + 20, y + 60);//畫出炮筒
			break;
			
		case 3://表示向左
			g.fill3DRect(x, y, 60, 10, false);//畫出坦克上面的輪子
			g.fill3DRect(x, y + 30, 60, 10, false);//畫出坦克下面的輪子
			g.fill3DRect(x + 10, y + 10, 40, 20, false);//畫出坦克右邊的輪子
			g.fillOval(x + 20, y + 10, 20, 20);//畫出蓋子
			g.drawLine(x + 30, y + 20, x, y + 20);//畫出炮筒
			break;
			
		default:
			System.out.println("暫時沒有處理");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}
	//處理wasd 按下的情況
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成的方法存根
		if(e.getKeyCode() == KeyEvent.VK_W) {//按下w鍵
			//改變坦克的方向
			hero.setDirect(0);
			//修改坦克坐標
			hero.moveUp();
			
		}else if(e.getKeyCode() == KeyEvent.VK_D) {
			hero.setDirect(1);
			hero.moveRight();
		}else if(e.getKeyCode() == KeyEvent.VK_S) {
			hero.setDirect(2);
			hero.moveDown();
		}else if(e.getKeyCode() == KeyEvent.VK_A) {
			hero.setDirect(3);
			hero.moveLeft();
		}
		//如果用戶按下的是 J,就發射
		if (e.getKeyCode() == MenuKeyEvent.VK_J) {
			System.out.println("用戶按下了J,開始射擊");
			hero.shotEnemytank();
		}
		
		
		//面板重繪
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}

}
