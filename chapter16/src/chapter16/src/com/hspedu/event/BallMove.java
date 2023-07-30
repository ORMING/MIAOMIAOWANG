package chapter16.src.com.hspedu.event;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//演示小球通過鍵盤控制上下左右的移動->講解Java的事件控制
public class BallMove extends JFrame{//窗口
	MyPanel mp = null;
	public static void main(String[] args) {
		BallMove ballMove = new BallMove();
	}
	//構造器
	public BallMove() {
		mp = new MyPanel();
		this.add(mp);
		this.setSize(400,300);
		//窗口JFrame對象可以監聽鍵盤事件,即可以監聽到面板發生的鍵盤事件
		this.addKeyListener(mp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
//面板可以畫出小球
class MyPanel extends JPanel implements KeyListener{
	
	//爲了讓小球可以移動,把他左上角的坐標設置成變量
	int x = 10;
	int y = 10;
	@Override
	public void paint(Graphics g) {
		// TODO 自动生成的方法存根
		super.paint(g);
		g.fillOval(x, y, 20, 20);//默認黑色
	}

	//有字符輸出時,該方法就會觸發
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}
	//黨某個鍵按下時,該方法就會觸發
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成的方法存根
		//System.out.println((char)e.getExtendedKeyCode()+"被按下..");
		
		//根據用戶按下的不同鍵,來處理小球的移動(上下左右的鍵)
		//在java中會給每一個鍵,分配一個值(int)
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {//KeyEvent.VK_DOWN 就是向下的箭頭的code值
			y++;
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			y--;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			x--;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x++;
		}
		
		//讓面板重繪
		this.repaint();
	}
	//黨某個鍵鬆開時觸發
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}
}
