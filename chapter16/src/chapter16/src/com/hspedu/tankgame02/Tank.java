package chapter16.src.com.hspedu.tankgame02;

public class Tank {
	private int x;//坦克橫坐標
	private int y;//坦克縱坐標
	private int direct;//坦克方向0上,1右,2下,3左
	private int speed = 1;
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//向上下左右移動
	public void moveUp() {
		y -= speed;
	
	}
	public void moveRight() {
		x += speed;
	
	}public void moveDown() {
		y += speed;
	
	}public void moveLeft() {
		x -= speed;
	
	}
	public Tank(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getDirect() {
		return direct;
	}
	public void setDirect(int direct) {
		this.direct = direct;
	}

	
}
