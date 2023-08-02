package chapter16.src.com.hspedu.threaduse;

import java.util.Iterator;

public class Thread01 {
	public static void main(String[] args) {
		//創建Cat對象,可以當作綫程來使用
		Cat cat = new Cat();
		cat.start();//啓動綫程
		//说明: 当main线程启动一个子线程 Thread-0 ,主线程不会阻塞,会继续执行
		
		
		System.out.println("主线程继续执行" + Thread.currentThread().getName());//名字main
		for (int i = 0; i < 10; i++) {
			System.out.println("主线程 i =" + i);
			//让主线程休眠
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}

//1儅一個類繼承了 Thread 類,該類就可以當成綫程使用
//2我們會重寫run方法,寫上自己的業務代碼
//3run Thread 類 實現了 Runnable 接口的run方法
/*
 *     @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

 */
class Cat extends Thread{
	int times = 0;
	@Override
	public void run() {//重寫run方法,加上自己的業務邏輯
		// TODO 自动生成的方法存根
		//該綫程每隔一秒在控制臺輸出"喵喵"
		while (true) {
				System.out.println("喵喵"+ (++times) + "綫程名=" + Thread.currentThread().getName());
			//讓該綫程休眠一秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			if(times == 80) {
				break;//儅timse 到80后 就結束循環,退出綫程
			}
		}
		
	}
}
