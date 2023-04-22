package com.hspedu.set_;

import java.util.HashSet;
@SuppressWarnings("all")
public class HashSet01 {
	private static HashSet set;

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		//说明
		//1.在执行add方法后,会返回一个boolean值
		//2.如果添加成功返回turn 否则返回false
		//3.可以通过remove指定删除哪个对象
		System.out.println(set.add("john"));
		System.out.println(set.add("lucy"));
		System.out.println(set.add("john"));
		System.out.println(set.add("john"));
		System.out.println(set.add("jack"));
		System.out.println(set.add("rose"));
		
		set.remove("john");
		System.out.println("set="+ set);
		
		//
		set = new HashSet();
		System.out.println("set="+set);
		set.add("lucy");
		set.add("lucy");
		set.add(new Dog("tom"));
		set.add(new Dog("tom"));
		System.out.println("set="+set);
		
		//在加深下,非常经典的面试题
		//看源码,
		set.add(new String("hsp"));//ok
		set.add(new String("hsp"));//加入不了
		System.out.println("set="+set);
	}
	
	
}
class Dog{//定义了dog类
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
}