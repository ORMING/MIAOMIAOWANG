package com.hspedu.stringBuffer_;

public class StringBufferExercise {
	public static void main(String[] args) {
		String str = null;
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		System.out.println(str.length());//4
		System.out.println(str);
		StringBuffer sb2 = new StringBuffer(str);//这个构造器会出现空指针异常
		System.out.println(sb2);
	}
}
