package chapter16.src.com.hspedu.method;

public class ThreadMethod02 {
	public static void main(String[] args) throws InterruptedException {
		T2 t2 = new T2();
		t2.start();
		
		for (int i = 0; i <= 20; i++) {
			Thread.sleep(1000);
			System.out.println("主綫程 吃了" + i + "包子");
			if (i == 5) {
				System.out.println("主綫程讓子綫程先吃");
				//join() 綫程插隊
//				t2.join();//相當於t2綫程 先執行完畢
				
				Thread.yield();//禮讓,不一定成功
				
				System.out.println("子綫程吃完 主綫程吃");
			}
		}
	}
}
class T2 extends Thread{//自定義的綫程類
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for (int i = 0; i <= 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("子綫程 吃了"+ i +"個包子");
		}
	}
		
	
	
}