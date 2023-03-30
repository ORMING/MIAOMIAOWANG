package com.hspedu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
	public static void main(String[] args) {
		
	}
	public void f1() throws FileNotFoundException,NullPointerException,ArrayStoreException {
		//创建了一个文件流对象
		//1 这里的异常是一个FileInputStream 编译异常
		//2 使用前面讲过的try-catch-finally
		//3 使用throws,抛出异常,让调用f2方法的调用者(方法)来处理
		//4 throws后面的异常类型可以是方法中产生的异常类型,也可以是它的父类
		//5 throws关键字后也可以是 异常列表,即可以抛出多个异常
		FileInputStream fis = new FileInputStream("d://aa.txt");
	}
}
