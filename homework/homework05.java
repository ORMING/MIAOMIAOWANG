package chapter11.hspedu.homework;

public class homework05 {
	public static void main(String[] args) {
		new A().f1();
		
	}
}
class A{
	private String NAME = "MING";
	public void f1() {
		class B{
			private final String NAME = "ミンクン";
			public void show() {
				System.out.println(this.NAME + A.this.NAME);
			}
		}
		B b = new B();
		b.show();
	}
	
}
