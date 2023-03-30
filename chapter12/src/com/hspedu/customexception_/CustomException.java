package com.hspedu.customexception_;

public class CustomException {
	public static void main(String[] args) {
		int age = 20;
		//要求范围在18-120之间,否则抛出一个自定义异常
		if(!(age>=18&&age<=120)) {
			//我们这里可以通过构造器,设置信息
			throw new AgeException("年龄需要在18 -120之间");
			
		}
		System.out.println("你的年龄范围正确.");
	}
}

//自定义一个异常
//1 一般情况,我们把自定义异常是继承RuntimeException
//2 即把自定义异常做成 运行时异常,好处是,我们可以使用默认的处理机制
//3 比较方便
class AgeException extends RuntimeException{
	public AgeException(String message) {
		super(message);
	}
}
