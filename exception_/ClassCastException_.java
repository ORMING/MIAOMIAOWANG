package com.hspedu.exception_;

public class ClassCastException_ {
	public static void main(String[] args) {
		A b = new B();//向上轉型
		B b2 = (B)b;//向下轉型,這裏OK
		C c2 = (C)b;//這裏就會抛出ClassCastException,因爲C和B本身沒有關係
	}
}
class A{}
class B extends A{}
class C extends A{}