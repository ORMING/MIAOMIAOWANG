package chapter16.src.com.hspedu.method;

public class ThreadMethod01 {
	public static void main(String[] args) throws InterruptedException {
		//測試相關方法
		T t = new T();
		t.setName("包子");
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();//啓動子綫程
		System.out.println(t.getName());
		
		
		//主綫程打印五句 hi ,就中斷子綫程的休眠
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println("h1" + i);
		}
		
		System.out.println(t.getName() + "綫程的優先級" + t.getPriority());
		t.interrupt();//執行到這裏,就會中斷 t 綫程的休眠
	}
}

class T extends Thread{//自定義的綫程類
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true) {
				for (int i = 0; i < 100; i++) {
				//Thread.currentThread().getName()獲取綫程名稱
				System.out.println(Thread.currentThread().getName()+ "吃包子~~" + i);
			}
			
			try {
				System.out.println(Thread.currentThread().getName()+ "休眠中~~");
				Thread.sleep(200000);//20秒
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				//儅該綫程執行到一個interrupt 方法時,就會catch 一個 異常,可以加入自己的業務代碼
				//InterruptedException 是捕獲到一個中斷異常.
				System.out.println(Thread.currentThread().getName()+ "被 interrupt了");
			}
		}
		
	}
	
}