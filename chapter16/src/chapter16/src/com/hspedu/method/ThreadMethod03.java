package chapter16.src.com.hspedu.method;

public class ThreadMethod03 {
	public static void main(String[] args) throws InterruptedException {
		MyDaemonthread myDaemonthread = new MyDaemonthread();
		myDaemonthread.setDaemon(true);//先設置再啓動
		myDaemonthread.start();
		//如果我們希望一個綫程結束后子綫程可以自動結束
		//我們只需要把他設置成守護綫程即可
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("開會中");
			Thread.sleep(1000);
		}
	}
	
}

class MyDaemonthread extends Thread{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for (; ;) {//無綫循環
			try {
				Thread.sleep(1000);//休眠1000ms
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("包子和利卡醬在聊天");
		}
	}
}