package chapter10.com.hspedu.codblock;

public class CodeBlockDetail01 {
	public static void main(String[] args) {
		// 类被加载的情况举例
		// 1创建实例对象时
		// 2创建子类对象时,父类也会加载，而且父类先加载
		AA aa = new AA();
		// 3使用类的静态成员时（静态属性，静态方法）
		System.out.println(Cat.n1);
		//static代码块，是在类加载时执行，并且只会执行一次
//		DD dd = new DD();
//		DD dd2 = new DD();
		
		System.out.println(DD.n1);//888
	}
}
class DD {
	public static int n1 = 888;
	// 静态代码块
	static {
		System.out.println("DD 的静态代码块1被执行");
		}
	//普通代码块，在new对象时，被调用，而且是没创建一次调用一次
	{
		System.out.println("DD 的普通代码块");
	}
}
class Animal {
	// 静态代码块
	static {
		System.out.println("Animal的静态代码块1被执行");
	}
}

class Cat extends Animal {
	public static int n1 = 99;// 静态属性

	static {
		System.out.println("Cat的静态代码块1被执行");
	}
}

class BB {
	// 静态代码块
	static {
		System.out.println("BB的静态代码块1被执行");
	}
}

class AA extends BB {
	// 静态代码块
	static {
		System.out.println("AA的静态代码块1被执行");
	}
}