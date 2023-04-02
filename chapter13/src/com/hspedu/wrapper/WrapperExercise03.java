package com.hspedu.wrapper;

public class WrapperExercise03 {
	public static void main(String[] args) {
		Integer i9 = 127;//integer.valueOf(127)
		Integer i10 =  new Integer(127);
		System.out.println(i9 == i10);//f
		
		Integer i11 = 127;
		int i12 =127;
		//只有基本数据类型,判断的是值是否相同
		System.out.println(i11 == i12);
		Integer i13 = 128;
		int i14 = 128;
		System.out.println(i13 == i14);
	}
}
