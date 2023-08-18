package chapter16.src.com.hspedu.ticket;
//使用多綫程模擬三個窗口同時售票100張
public class SellTicket {
	public static void main(String[] args) {
//		//測試
//		SellTicket01 sellTicket01 = new SellTicket01();
//		SellTicket01 sellTicket02 = new SellTicket01();
//		SellTicket01 sellTicket03 = new SellTicket01();
//		//會出現超賣現象
//		sellTicket01.start();
//		sellTicket02.start();
//		sellTicket03.start();
		System.out.println("使用接口的方法來售賣");
		Sellticket02 sellticket02 = new Sellticket02();
		new Thread(sellticket02).start();//第1個綫程
		new Thread(sellticket02).start();//第2個綫程
		new Thread(sellticket02).start();//第3個綫程
	}
}

//使用Thread方式

class SellTicket01 extends Thread{
	
	private static int tickeNum = 100;//讓多個綫程共享 tickeNum
	
	@Override
	public void run() {
		while (true) {
			
			if(tickeNum <= 0) {
				System.out.println("售票結束...");
				break;
			}
			//休眠50秒
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("窗口" + Thread.currentThread().getName() + "售出一張票" + "剩餘票數=" + (--tickeNum));
		}
		
		
	}
}

//實現接口方式
class Sellticket02 implements Runnable{
	private int tickeNum = 100;//讓多個綫程共享 tickeNum
	
	@Override
	public void run() {
		while (true) {
			
			if(tickeNum <= 0) {
				System.out.println("售票結束...");
				break;
			}
			//休眠50秒
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("窗口" + Thread.currentThread().getName() + "售出一張票" + "剩餘票數=" + (--tickeNum));
		}
		
		
	}
}