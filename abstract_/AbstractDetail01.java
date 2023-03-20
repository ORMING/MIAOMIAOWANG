package chapter10.com.hspedu.abstract_;

public class AbstractDetail01 {
	public static void main(String[] args) {
		//		new A();抽象类不可以被实例化
	}

}	
//抽象类不一定要包含abstract方法。也就是说抽象类中可以没有抽象方法
//还可以有实现的方法
abstract class A{
	public void hi() {
		System.out.println("hi");
	}
}
//一旦类包含了abstract方法，则这个类必须声明为abstract类
abstract class B{
	public abstract void hi();
}
//abstract 只能修饰类和方法不能修饰属性和其他
class C{
//	public abstract int n1 = 1;
}