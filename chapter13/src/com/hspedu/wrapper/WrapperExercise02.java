package com.hspedu.wrapper;

public class WrapperExercise02 {
	public static void main(String[] args) {
		Integer i = new Integer(1);
		Integer j = new Integer(2);
		System.out.println(i == j);//f 对地址比较
		
		//所以这里主要看范围-128~127就是直接返回
		Integer m = 1;//底层Integer.valueOf(1);->阅读源码
		Integer n = 1;//底层Integer.valueOf(1);
		System.out.println(m == n);//T
		
		
		//所以这里主要看范围-128~127就是直接返回
		//,否则,就是new Integer.valueOf(1);
		Integer x = 128;//底层Integer.valueOf(1);
		Integer y = 128;//底层Integer.valueOf(1);
		System.out.println(x == y);
		
	}
	
	
}
