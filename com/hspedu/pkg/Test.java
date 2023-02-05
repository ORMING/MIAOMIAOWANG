package com.hspedu.pkg;

import com.hspedu.modifier.A;


public class Test {
	public static void main(String[] args) {
		A a = new A();
		//在不同包中，可以访问public修饰的属性或方法
		//但是不能访问protected，默认，private修饰的属性或方法
		System.out.println(a.n1);
	}
}

//只有默认和public可以修饰类
class Tiger{}