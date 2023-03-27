package chapter11.hspedu.homework;

public class Homework03 {
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.shout();
		Animal dog = new Dog();
		dog.shout();
	}
}
abstract class Animal {//抽象类
	public abstract void shout();
}
class Cat extends Animal{

	@Override
	public void shout() {
		// TODO 自动生成的方法存根
		System.out.println("喵会喵喵叫");
	}
	
}
class Dog extends Animal{

	@Override
	public void shout() {
		// TODO 自动生成的方法存根
		System.out.println("狗会汪汪叫");
	}
	
}