package chapter08.com.hspedu.object_;

public class Finalize_ {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Car bmwCar = new Car("宝马");
		bmwCar = null;//这个时候car对象就是一个垃圾，垃圾回收器就会回收（销毁）对象，
		//在销毁对象前，会调用该对象的Finalize方法
		//这个时候就可以在该方法中写入自己的业务逻辑代码，比如释放资源（数据连接，或者是打开的文件。。）
		System.gc();//主动调用垃圾回收器 
		System.out.println("程序结束");
	}

}
class Car{
	private String name;

	public Car(String name) {
		super();
		this.name = name;
	}
	//重写finalize
	//快捷生成直接输入finalize()
	@Override
	protected void finalize() throws Throwable {
		// TODO 自动生成的方法存根
		System.out.println("销毁汽车" + name);
		System.out.println("释放了某些资源");
	}
}
