package chapter16.src.com.hspedu.method;

public class ThreadMethodExercise {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t3 = new Thread(new T3());
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("h1" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			if (i == 5) {//説明主綫程輸出了5次hi
				t3.start();//啓動綫程	
				t3.join();//立即插入
			}
		}
		System.out.println("主綫程結束");
	}
}

class T3 implements Runnable {
	private int count = 0;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		
		while (true) {

			System.out.println("hello" + (++count));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if (count == 10) {
				System.out.println("子綫程結束");
				break;
			}
			
		}

	}

}