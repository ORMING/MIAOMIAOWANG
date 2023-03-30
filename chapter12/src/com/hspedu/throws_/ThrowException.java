package com.hspedu.throws_;

public class ThrowException {
	public static void main(String[] args) {
		try {
			ReturnExceptionDemo.methomdA();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ReturnExceptionDemo.methodB();
	}
}
class ReturnExceptionDemo{
	static void methomdA() {
		try {
			System.out.println("进入方法A");
			throw new RuntimeException("制造异常");
		}finally {
			System.out.println("用A方法的finally");
		}
	}
	static void methodB() {
		try {
			System.out.println("进入方法B");
			return;
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			System.out.println("调用B方法的finally");
		}
	}
}
