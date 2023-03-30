package com.hspedu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
	public static void main(String[] args) {
		f2();
	}
	public static void f2() /*throws ArithmeticException*/{
		//1 对于编译异常,程序中必须处理,比如try-catch 或者 throws
		//2 对于运行时异常,程序中如果没有处理,默认就是throws的方式处理
		 
		int n1 = 10;
		int n2 = 0;
		double res = n1 / n2;
	}
	public static void f1() {
		//1 因为放() 方法抛出一个编译异常
		//2 即这时,就要去f1() 必须处理这个编译异常
		//3 在f1()中要么 try-catch-finally ,或者继续throws 这个编译异常
		//f3();//抛出异常
	}
	public static void f3()throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d://aa.txt");
	}
	public static void f4() {
		//1 在f4()中调用f5() 是OK
		//2 原因是f5()抛出的是运行异常
		//3 而java中,并不要求程序员显示处理,因为有默认处理机制
		
		f5();
	}
	public static void f5() throws ArithmeticException {
		
	}
}
class Father{
	public void method()throws RuntimeException{}
}
class Son extends Father{
	//3 子类重写父类方法的时候,对抛出异常的规定:子类重写的方法
	// 所抛出的异常必须要么和父类异常一致,要么为父类抛出的异常类型的子类型
	//4 在throws过程中,如果有方法 try-catch,就相当于处理异常,就可以不必throws
	@Override
	public void method() throws RuntimeException {
		// TODO 自动生成的方法存根
		super.method();
	}
}