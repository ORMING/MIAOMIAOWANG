package com.hspedu.homework;

public class Homework01 {
	public static void main(String[] args) {
		//测试
		String str = "abcdef";
		System.out.println(str);
		try {
			str = reverse(str,4,4);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
			return;
		}
		System.out.println(str);
	}
	public static String reverse(String str, int start , int end) {
		//对输入的参数进行验证
		//重要的编程技巧
		//(1)写出正确的情况
		//(2)然后取反就好了
		if(!(str != null && start >= 0&& end > start && end < str.length())) {
			throw new RuntimeException("参数错误"	);
		}
		
		
		char[] chars = str.toCharArray();
		char temp = ' ';//交换辅助变量
		for(int i = start,j = end; i < j ;i++,j--) {
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		//使用chars 构建一个String返回
		return new String(chars	);
	}
}
