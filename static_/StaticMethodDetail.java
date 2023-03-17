package chapter10.com.hspedu.static_;

public class StaticMethodDetail {
	public static void main(String[] args) {
		D.h1();//ok
		//D.say();无法调用，需要先创建对象
		D d = new D();
		
	}
}
class D{
	private int n1 = 100;
	private static int n2 = 3;
	public void say() {//非静态方法
		
	}
	public static void h1() {//静态方法
		//类方法中不允许使用和对象有关的关键字
		//比如this和super。普通方法可以
		//this.n1;报错
		
	}
	//类方法只能访问静态变量或静态方法
	public static void hello() {
		System.out.println(n2);
		System.out.println(D.n2);
//		System.out.println(this.n2);报错
		h1();//ok
		//say();报错
	}
	//普通成员方法，既可以访问 非静态成员，也可以访问静态成员
	public void ok() {
		//非静态成员
		System.out.println(n1);
		say();
		//静态成员
		System.out.println(n2);
		hello();
		
	}
}
