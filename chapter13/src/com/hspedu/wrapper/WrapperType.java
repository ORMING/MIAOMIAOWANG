package com.hspedu.wrapper;

public class WrapperType {
	public static void main(String[] args) {
		//基本数据类型 -> 包装类
		//boolean -> Boolean
		//char -> Character
		//byte -> Byte
		//int -> Integer
		//long -> Long
		//float -> Float
		//double -> Double
		//void -> Void
		//上面所有类都是Number的子类,都实现了Comparable接口
		//Number类是Object的子类,实现了Serializable接口
		/*
		 * 1 jdk5以前手动装箱和拆箱方式,装箱: 基本类型 -> 包装类型.反之,称为 拆箱
		 * 2 jdk5以后(含5)的自动装箱和拆箱方式
		 * 3 自动装箱底层调用的是valueOf方法,比如Integer.valueOf()
		 */
	}
}
