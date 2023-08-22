package chapter16.src.com.hspedu.state;

public class ThreadState {
	public static void main(String[] args) throws InterruptedException {
		T t = new T();
		System.out.println(t.getName() + "狀態" + t.getState());
		t.start();
		while (Thread.State.TERMINATED != t.getState()) {
			System.err.println(t.getName() + "狀態" + t.getState());
			Thread.sleep(1000);
		}
		System.err.println(t.getName() + "狀態" + t.getState());
	}
}

class T extends Thread{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true) {
			for (int i = 0; i < 10; i++) {
				System.out.println("h1" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
			}
			break;
		}
	}
}