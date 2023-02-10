package com.hspedu.extend_.Super_;

public class B extends A{
	//访问父类的属性，但不能访问父类的private属性  super.属性名
	public int n1 = 888;
	//编写测试方法
	public void test() {
		System.out.println("super.n1" + super.n1);
	}
	
	public void hi() {
		System.out.println(super.n1 + " " + super.n2 + " " + super.n3 );
	}//访问父类的方法但是不能访问父类的private方法。super.方法名(形参列表);
	public void cal() {
		System.out.println("B类的cal（）方法");
	}
	public void sum() {
		System.out.println("父类的sum（）");
		//希望调用父类的A的cal方法
		//这时，因为子类B没有cal方法，因此可以使用下面三种方法
		//找cal方法时，顺序是，先找本类，如果有，则调用，
		//如果没有则找父类（如果有，并且可以调用，则调用）
		//如果父类没有，则继续找父类，直到Object类
		//如果查找中找到了，但是不能访问就报错
		//如果查找方法中没有找到则提示提示方法不存在
//		cal();
//		this.cal();//等价cal
		super.cal();//找cal(super.cal())方法的顺序是直接找父类其他规则一样
		//属性访问规律和方法相同
		System.out.println(n1);
		System.out.println(this.n1);
		System.out.println(super.n1);
	}
	public void ok() {
		super.test100();
		super.test200();
		super.test300();
		//super.test400();不能访问private方法
	}
	//访问父类的无参构造器（前面用过）：super(形参列表)；只能放在构造器第一句；只能出现一句
	public B() {
//		super();
//		super("jack");
		super("jack",20);
	}
}
