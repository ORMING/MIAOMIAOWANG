package chapter18.com.hspedu.tankgame3;

//自己的坦克
public class Hero extends Tank{
	//定義一個shot對象(綫程)
	Shot shot = null;

	public Hero(int x, int y) {
		super(x, y);
		// TODO 自动生成的构造函数存根
	}
	
	//射擊
	public void shotEnemytank() {
		//創建 shout 對象,根據當前Hero對象的位置和方向來創建shot
		switch (getDirect()) {//得到Hero對象的位置和方法
		case 0://向上
			shot = new Shot(getX() + 20,getY(),0);
			break;
		case 1://向右
			shot = new Shot(getX() + 60,getY() + 20,1);
			break;
		case 2://向下
			shot = new Shot(getX() + 20,getY() + 60,2);
			break;
		case 3://向左
			shot = new Shot(getX(),getY() + 20,3);
			break;
		}
		//啓動shot綫程
		new Thread(shot).start();
		
	}
}
