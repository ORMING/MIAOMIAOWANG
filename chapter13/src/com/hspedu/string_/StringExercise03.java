package com.hspedu.string_;

public class StringExercise03 {
	public static void main(String[] args) {
		String a = "hsp";//a 指向 常量池的 "hsp"
		String b = new String("hsp");//b 指向 堆中对象
		System.out.println(a.equals(b));
		System.out.println(a == b);
		//b.intern()方法是返回常量池的地址
		System.out.println(a == b.intern());
		System.out.println(b == b.intern());
		
		
		
		
	}
}
