package chapter10.com.hspedu.codblock;

public class CodeBlockDetail02 {
	public static void main(String[] args) {
		A a = new A();
	}
}
class A{
	public int n2 = getN2();//普通属性初始化
	{//普通代码块
		System.out.println("A 普通代码块01");
		
	}
	static {
		System.out.println("A 静态代码块01");
	}
	//静态属性初始化
	private static int n1 = getN1();
	
	public static int getN1() {
		System.out.println("getN1()被调用");
		return 100;
	}
	public int getN2() {//普通方法
		System.out.println("getN2()被调用");
		return 200;
	}
	//无参构造器
	public A() {
		System.out.println("A构造器被调用");
	}
}
