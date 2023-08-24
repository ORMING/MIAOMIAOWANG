package chapter16.src.com.hspedu.homework;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		A a = new A();
		B b = new B(a);//一點要注意這裏需要傳入a
		a.start();
		b.start();
	}
}
//創建A綫程
class A extends Thread{
	private boolean loop = true;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (loop) {
			System.out.println((int)(Math.random()*100+1));//輸出隨機數
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	public void setLoop(boolean loop) {
		this.loop = loop;
	}
}

//直到第二個綫程從鍵盤讀取了"Q"命令
class B extends Thread{
	private A a;
	private Scanner scanner = new Scanner(System.in);

	public B(A a) {
		super();
		this.a = a;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		while (true) {
			System.out.println("請輸入你的指令Q");
			char key = scanner.next().toUpperCase().charAt(0);
			if(key == 'Q') {
				a.setLoop(false);
				break;//b綫程推出
			}
		}
		
	}
	
	
}