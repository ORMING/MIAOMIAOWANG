package chapter18.com.hspedu.tankgame3;

public class Shot implements Runnable{
	int x;//子彈x
	int y;//子彈y
	int direct = 0;//子彈方向
	int speed = 2;//子彈速度
	boolean isLive = true;//是否存貨子彈
	
	//構造器
		public Shot(int x, int y, int direct ) {
		super();
		this.x = x;
		this.y = y;
		this.direct = direct;
	
	}
	
	@Override
	public void run() {//射擊
		// TODO 自动生成的方法存根
		while (true) {
			//休眠50毫秒
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			//更具方向來改變x,y坐標
			switch (direct) {
			case 0://上
				y -= speed;
				break;
			case 1://右
				x += speed;
				break;
			case 2://下
				y += speed;
				break;
			case 3://左
				x -= speed;
				break;

			}
			//測試,這裏我們輸出x,y坐標
			System.out.println("子彈x"+x+"y"+y);
			//儅子彈移動到面板邊界時,就應該銷毀(把啓動的綫程銷毀)
			if(!(x >= 0 && x <= 1000 && y >= 0 && y<= 750)) {
				isLive = false;
				System.out.println("子彈被銷毀");
				break;
			}
		}
	}


	
}
