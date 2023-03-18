package chapter10.com.hspedu.main_;

public class Main01 {
	//静态的变量/属性
	private static String name = "喵喵";
	//非静态的变量/属性
	private int n1 =10000;
	//静态方法
	public static void h1() {
		System.out.println("Main01的 h1方法");
	}
	//非静态方法
	public void cry() {
		System.out.println("Main01的 cry方法");
	}
	public static void main(String[] args) {
		//可以直接使用 name
		//1.静态方法main可以访问本静态成员
		System.out.println("name" + name);
		h1();
		//2.静态方法main 不可以访问本类的非静态成员
//		System.out.println("n1 = " + n1);//错误
//		cry();//错误
		//3静态方法main要访问本类的非静态成员，需要先创建对象，再调用即可
		Main01 main01 = new Main01();
		System.out.println(main01);
		main01.cry();
	}
}
