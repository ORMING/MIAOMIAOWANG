package chapter10.com.hspedu.abstract_;

public class Abstract01 {
	public static void main(String[] args) {
		
	}
}
abstract class Animal{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	//这里eat 实现了也没有意义
	//即父类方法不确定性的问题
	//===>考虑将该方法设计为抽象方法（abstract）方法
	//===>所谓抽象方法就是没有实现的方法
	//===>所谓没有实现方法就是指，没有方法体
	//===>当一个类中存在抽象方法时，需要将该类声明为abstract类
	//===>一般来说，抽象类会被继承，由其子类来实现
//	public void eat() {
//		System.out.println("这时一个动物不知道吃啥");
//	}
	public abstract void eat();
}
