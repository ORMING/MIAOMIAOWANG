package com.hspedu.modifier;

public class B {
	public void say() {
		A a = new A();
		//再同一个包中可以访问public，protected和默认，不能访问private
		System.out.println("n1=" + a.n1 + " " + a.n2 + " " + a.n3 + " ");
		
	}

}
