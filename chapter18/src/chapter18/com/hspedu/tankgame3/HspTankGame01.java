package chapter18.com.hspedu.tankgame3;

import javax.swing.JFrame;

public class HspTankGame01 extends JFrame{
	
	//定義MyPanel
	MyPanel mp = null;
	public static void main(String[] args) {
		
		HspTankGame01 hspTankGame01 = new HspTankGame01();
	}
	public HspTankGame01() {
		// TODO 自动生成的构造函数存根
		mp = new MyPanel();
		this.add(mp);//把面板(就是游戲的繪圖區域添加)
		this.setSize(1000,750);
		this.addKeyListener(mp);//讓JFrame監聽鍵盤事件
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
