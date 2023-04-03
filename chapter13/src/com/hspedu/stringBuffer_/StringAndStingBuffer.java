package com.hspedu.stringBuffer_;

public class StringAndStingBuffer {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//String -> StringBuffer
		String str = "hello tom";
		//方式1 使用构造器
		//注意:返回的才是StringBuffer对象,对str 本身没有影响
		StringBuffer stringBuffer = new StringBuffer(str);
		//方式2 使用append方法
		StringBuffer stringBuffer2 = new StringBuffer();
		stringBuffer2 = stringBuffer2.append(str);

		// StringBuffer -> String
		StringBuffer stringBuffer3 = new StringBuffer("喵喵王");
		//方式1 使用Stringbuffer提供的 toString方法
		String s = stringBuffer3.toString();

		//方式2 使用构造器来搞定
		String s1 = new String(stringBuffer3);
	}

}
