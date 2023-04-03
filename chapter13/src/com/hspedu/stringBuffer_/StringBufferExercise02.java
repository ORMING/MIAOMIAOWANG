package com.hspedu.stringBuffer_;

public class StringBufferExercise02 {
	public static void main(String[] args) {
		//思路分析
		//1 定义一个Scanner对象,接收用户输入的 价格(String)
		//2 希望使用到 StringBuffer的 insert,需要将 String 转成 StringBuffer
		//3 然后使用相关方法进行字符串处理
		//代码实现
		
		String price = "1342353524625236765.49";
		StringBuffer sb = new StringBuffer(price);
		//先完成一个最简单拿到实现123,564.49
		//找到小数点的索引,然后再该位置前3位,插入,即可
//		int i =sb.lastIndexOf(".");
//		sb = sb.insert(i - 3, ",");
		//上面两部要做成一个循环
		for(int i =sb.lastIndexOf(".")-3;i > 0;i-=3) {
			sb = sb.insert(i, ",");
		}
		System.out.println(sb);
	}
}
