package com.hspedu.wrapper;

public class WrapperExercise01 {
	public static void main(String[] args) {
		Double d =100d;//自动装箱
		Float f =1.5f;//自动装箱
		
		Object obj1 = true?new Integer(1):new Double(2.0);//三元运算符,保持统一运算精度
		System.out.println(obj1);//1.0
		
		Object obj2;
		if(true) {
			obj2 = new Integer(1);
		}else {
			obj2 = new Double(2.0);
		}
		System.out.println(obj2);//1不统一精度
	}
}
