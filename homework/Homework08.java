package chapter11.hspedu.homework;

public class Homework08 {
	public static void main(String[] args) {
		Color color = Color.RED;
		color.show();
		
		//使用switch
		//switch()中,放入枚舉對象
		//在case 后直接寫上在枚舉類中,定義的枚舉對象即可
		
		switch (color) {
		case YELLOW:
			System.out.println("匹配到黃色");
			break;
		case BLACK:
			System.out.println("匹配到黑色");
			break;
		case RED:
			System.out.println("匹配到紅色");
			break;
		case BLUE:
			System.out.println("匹配到藍色");
			break;
		case GREEN:
			System.out.println("匹配到綠色");
			break;
		default:
			System.out.println("沒有匹配到顔色");
			break;
		}
	}
}
interface IMyinterface{
	public void show() ;
}
enum Color implements IMyinterface{
	RED(255,0,0),BLUE(0, 0, 255),BLACK(0, 0, 0),YELLOW(255, 255, 0),GREEN(0, 255, 0);
	
	private int redVlue;
	private int greenVlue;
	private int blueVlue;
	
	private Color(int redVlue, int greenVlue, int blueVlue) {
		this.redVlue = redVlue;
		this.greenVlue = greenVlue;
		this.blueVlue = blueVlue;
	}

	@Override
	public void show() {
		// TODO 自动生成的方法存根
		System.out.println("屬性值為" +" "+ redVlue +" "+ greenVlue +" "+ blueVlue);
	}
	
}