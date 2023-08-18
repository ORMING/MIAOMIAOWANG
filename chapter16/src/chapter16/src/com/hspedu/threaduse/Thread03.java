package chapter16.src.com.hspedu.threaduse;

public class Thread03 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		Thread thread = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread.start();//启动第一个
		thread2.start();//启动第二个
	}
}

class T1 implements Runnable{
	
	int count = 0;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		//每隔一秒输出hallo world,输出10次
		while (true) {
			System.out.println("hallo world" + (++count));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if (count == 50) {
				break;
			}
		}
		
	}
	
}

class T2 implements Runnable{
	
	int count = 0;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		//每隔一秒输出hallo world,输出5次
		while (true) {
			System.out.println("hi world" + (++count));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if (count == 60) {
				break;
			}
		}
	}
	
}