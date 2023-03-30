package com.hspedu.try_;

public class TryCatchDetail03 {
	public static void main(String[] args) {
		//5 可以直接进行try-finally 配合使用,这种用法相当于没有捕获异常,因此程序会直接崩溃/退出.应用场景,就是执行一段代码,不管是否发生异常,都必须执行某个业务逻辑
		try {
			int n1 = 10;
			int n2 = 0;
			System.out.println(n1/n2);
		}finally {
			System.out.println("执行了fially");
		}
		System.out.println("程序继续执行..");//如果上面程序出现了异常在返回了finally之后就会之前退出,这句话就没机会运行
	}
}
