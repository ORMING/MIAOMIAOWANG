package chapter08.com.hspedu.debug_;

//debug对象创建的过程，加深对调试的理解
public class DebugExercise {
	public static void main(String[] args) {
		//创建对象的流程
		//1加载Person类信息
		//2初始化2.1默认初始化2.2显示初始化
		//3返回对象的地址
		Person jack = new Person("jack", 20);
		System.out.println(jack);
	}
}
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "Monster{" + '\''+
				"name=" + name +'\''+
				",age=" + age +
				'}';
	}
	
}