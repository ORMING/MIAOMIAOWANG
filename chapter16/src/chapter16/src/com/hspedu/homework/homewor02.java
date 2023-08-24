package chapter16.src.com.hspedu.homework;

public class homewor02 {
	public static void main(String[] args) {
		BB bb = new BB();
		BB bb2 = new BB();
		bb.start();
		bb2.start();
	}
}

class BB extends Thread {
	private int qian = 10000;
	private boolean loop = true;

	public void sell() {
		
			synchronized ( this ) {
				if (qian <= 0) {
					System.out.println("取錢結束...");
					loop = false;
					return;
				}

				// 休眠50秒
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				qian -= 1000;
				System.out.println("用戶" + Thread.currentThread().getName() + "取出1000" + "餘額=" + qian);}
		
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		while (loop) {
			sell();
		}

	}
}