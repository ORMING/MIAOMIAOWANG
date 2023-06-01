package chapter15.src.com.hspedu.generic.improve;

import java.util.ArrayList;



public class Generic02 {
	public static void main(String[] args) {
		//使用汎型來完成代碼
		//1 當我們ArrayList<Dog> 表示存放到arrayList集合中的元素是Dog類型
		//2 如果編譯器發現添加的類型,不滿足要求,就會報錯
		//3 在遍歷的時候,可以直接取出dog類型而不是object類型
		//4 public class ArrayList<e>{}E成爲汎型
		ArrayList<Dog> arrayList = new ArrayList<Dog>();
		arrayList.add(new Dog("包子",10));
		arrayList.add(new Dog("奧利奧",2));
		arrayList.add(new Dog("丸子",1));
		//假如我們的程序猿,不小心添加了一隻貓
//		arrayList.add(new Cat("巧克力",8));
		for (Dog dog : arrayList) {
			System.out.println(dog.getAge()+"-"+dog.getName());
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