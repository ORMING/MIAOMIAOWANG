package com.hspedu.wrapper;

public class WrapperVSString {
	public static void main(String[] args) {
		//包装类(Integer)->String
		Integer i = 100;//自动装箱
		//方式1 
		String str1 = i + "";//得到一个Integer i为基本数值转成String字符串的,对原本的 i 没有任何转换
		//方式2 
		String str2 = i.toString();
		//方法3
		String str3 = String.valueOf(i);//这里可以直接接收一个 i
		
		
		//String -> 包装类(Integer)
		String str4 = "12345";
		Integer i2 = Integer.parseInt(str4);//先转换成int 再自动装箱
		Integer i3 = new Integer(str4);//构造器
		System.out.println("ok" );
	}
}
