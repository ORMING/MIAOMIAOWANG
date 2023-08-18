package chapter16.src.com.hspedu.exit;

public class ThreadExit {
	public static void main(String[] args) {
		T t1 = new T();
		t1.start();
		
		//如果希望主綫程控制t1 的終止,必須可以修改loop變量
		//讓t1 推出run方法,從而終止 t1 綫程 -> 通知方式
		
		
		//讓主綫程休眠 10 秒 再通知 t1綫程推出
		System.out.println("主綫程休眠10秒");
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		t1.setLoop(false);
	}
}

class T extends Thread{
	private int count = 0;
	//設置一個控制變量
	private boolean loop = true;
	public void setLoop(boolean loop) {
		this.loop = loop;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(loop) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}//讓當前綫程休眠20ms
			System.out.println("T運行中"+ (count++));
		}
	}
}

