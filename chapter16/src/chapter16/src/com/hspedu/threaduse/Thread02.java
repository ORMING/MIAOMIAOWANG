package chapter16.src.com.hspedu.threaduse;

public class Thread02 {
	public static void main(String[] args) {
//		Dog dog = new Dog();
////		dog.run();这里不能调用start
//		//创建了Thread对象,把dog 对象(实现Runable),放入Thead
//		Thread thread = new Thread(dog);
//		thread.start();
//	}
		Tiger tiger = new Tiger();//实现了 Runnable
		
		
	
}
//线程代理类,模拟了一个极简的 Proxy 类
class Proxy implements Runnable{//你可以把Proxy类当作ThreadProxy 代理
	
	private Runnable target = null;//属性,类型是 Runnable
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		if(target != null) {
			target.run();
		}
	}

	public Proxy(Runnable target) {
		
		this.target = target;
	}
	public void start() {
		start0();//这个方法时才是真正调用多线程的方法
	}
	public void start0() {
		run();
	}
	
}

}

class Animal{}

class Tiger extends Animal implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println("嗷嗷");
	}
	
}
class Dog implements Runnable{//通过实现Runnable接口,开发线程
	
	int count = 0;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true) {
			System.out.println("汪汪"+ (++count) + Thread.currentThread().getName());
			
			//休眠1秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if(count==10) {
				break;
			}
		}
	}
	
}