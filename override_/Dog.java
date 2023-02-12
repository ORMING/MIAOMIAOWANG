package chapter08.com.hspedu.override_;

public class Dog extends Animal {
	//1.因为dog是Animal子类
	//2.dog的cry方法和Animal的cry定义形式一样（名称、返回类型、参数）
	//3.这个时候我们就说Dog的cry方法，重写了Animal的cry方法
	public void cry() {
		System.out.println("小狗汪汪叫");
	}
	//细节：子类方法的返回类型和父类方法的返回类型一样，
	//或者是父类返回类型的VT比如 父类 返回类型是 Object，子类方法类型是String
	public String m1() {
		return null;
	}
	//这里Object不是 String 的子类，因此编译器错误
//	public Object m2() {
//		return null;
//	}
	
//	public BBB m3() {
//		return null;
//	}
	//细节子类方法不能缩小父类方法的访问权限
	//public>protected>默认>private
	public void eat() {
		
	}
}

class AAA{
	
}

class BBB extends AAA{
	
}
