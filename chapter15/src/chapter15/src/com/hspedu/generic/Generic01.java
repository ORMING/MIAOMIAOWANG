package chapter15.src.com.hspedu.generic;

import java.util.ArrayList;
@SuppressWarnings("all")
public class Generic01 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(new Dog("包子",10));
		arrayList.add(new Dog("奧利奧",2));
		arrayList.add(new Dog("丸子",1));
		//假如我們的程序猿,不小心添加了一隻貓
		arrayList.add(new Cat("巧克力",8));
		
		//遍歷
		for (Object o : arrayList) {
			//向下轉型
			Dog dog =(Dog)o;
			System.out.println(dog.getName()+"-"+dog.getAge());
		}
	}
}
class Dog{
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
class Cat{
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}