package com.hspedu.string_;

public class StringMethod01 {

	public static void main(String[] args) {
		// 1 equals 前面已经讲过 内容比较
		String str1 = "hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		// 2 equalsIgnoreCase 忽略大小写的判断内容是否相等
		String username = "JOHN";
		if ("john".equalsIgnoreCase(username)) {
			System.out.println("Success!");
		} else {
			System.out.println("Failure!");
		}
		// 3 length 获取字符的个数,字符串的长度
		System.out.println("喵喵".length());
		// 4 indexOf获取字符在字符串对对象中第一次出现的索引,索引从0开始,如果找不到,返回-1
		String s1 = "wer@terwe@g";
		int index = s1.indexOf('@');//输入内容可以不是一个字符,也可以是一个字符串
		System.out.println(s1.indexOf("09"));
		System.out.println(index);
		// 5 lastIndexOf 获取字符子啊字符串中最后一次出现的索引,索引从0开始,如果找不到,返回-1
		String s2 = "wer@terwe@g@";
		int index1 = s2.lastIndexOf('@');
		System.out.println(index1);
		// 6 substring 截取指定范围的子串
		String name = "hello.张三";
		// 下面name.substring(6) 从6开始截取后面的所有内容
		System.out.println(name.substring(6));
		// name.substring(0,5) 从0开始截取到后面5个字符
		System.out.println(name.substring(0, 5));
		System.out.println(name.substring(2, 5));

	}

}
