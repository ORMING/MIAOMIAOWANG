package com.hspedu.exception_;

public class NumberFormatException_ {
	public static void main(String[] args) {
		String name = "秒";
		//將String轉成int
		int num = Integer.parseInt(name);//抛出NumberFormatException
		System.out.println(num);
		
	}
}
