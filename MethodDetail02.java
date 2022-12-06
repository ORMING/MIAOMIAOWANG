public class MethodDetail02{
	public static void main(String[] args) {
		A a = new A();
		a.sayOk();
		a.m1();
	}
}
class A{
	//同一個類中的方法直接調用
	public void print(int n) {
		System.out.println("print()方法被調用n=" +n);
		
	}
	public void sayOk() {
		print(10);
		System.out.println("繼續執行sayOk");
	}
	public void m1() {
		//創建B對象，然後在調用方法即可
		System.out.println("m1()方法被調用");
		B b = new B();
		b.hi();
		System.out.println("m1()繼續執行");
	}
}
class B{
	public void hi() {
		System.out.println("b類中的hi（）被執行");
	}
}