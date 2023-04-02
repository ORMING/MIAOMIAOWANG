package com.hspedu.string_;

public class StringExercise08 {
	public static void main(String[] args) {
		String a= "hallo";
		String b= "abc";
		//1 先 创建一个 StringBuilder sb = StringBuilder()
		//2 执行 sb.append("hello");
		//3 sb.append("abc");
		//4 String c = sb.toString();
		// 最后其实是 c 指向堆中的对象(String) value[] -> 池中 "helloabc"
		String c = a + b;
		String d = "helloabc";
		System.out.println(c == d);
		String e = "hello" + "abc";
		System.out.println(d == e);
	}
}
