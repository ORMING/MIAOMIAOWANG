package com.hspedu.try_;

public class TryCatchDetail02 {
	public static void main(String[] args) {
		//1 如果try代碼塊有可能多個異常
		//2 可以使用多个catch 分别捕获不同的信息
		//3 要求子类异常写在前面,父类异常写在后面
		
		//5 可以直接进行try-finally 配合使用,这种用法相当于没有捕获异常,因此程序会直接崩溃/退出.应用场景,就是执行一段代码,不管是否发生异常,都必须执行某个业务逻辑
		try {
			Person person = new Person();
			person = null;
			System.out.println(person.getName());// NullPointerExcepton空指針異常
			int n1 = 10;
			int n2 = 0;
			int res = n1 / n2;// ArithmeticException算數異常
		} catch (NullPointerException e) {
			// TODO 自动生成的 catch 块
			System.out.println("空指針異常=" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("算數異常=" + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

		}
	}
}

class Person {
	private String name;

	public String getName() {
		return name;
	}

}
