package chapter10.com.hspedu.abstract_;

public class AbstractDetail02 {
	public static void main(String[] args) {
		System.out.println("hello");
	}
}
//抽象方法不能使用private，final和static来修饰，因为这些关键字都是和重写相违背的
abstract class H{
//	private abstract void hi();
//	public final abstract void hi();
//	public static abstract void hi();
}

//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法除非它们自己也声明为abstract类
abstract class E {
	public abstract void hi();
}

abstract class F extends E {

}

class G extends E {
	@Override
	public void hi() {// 这里相当于G子类实现了父类E的抽象发方法，所谓实现方法，就是有方法体{}就行
		// TODO 自动生成的方法存根

	}
}

//抽象类本质还是类所以可以拥有类的所有方法
abstract class D {
	public int n1 = 10;
	public static String name = "喵喵";

	public void hi() {
		System.out.println("喵");

	}

	public abstract void hello();

	public static void ok() {
		System.out.println("ok");
	}
}
