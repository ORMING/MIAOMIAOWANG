package chapter10.com.hspedu.Interface_;

public class InterfaceExercise01 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		System.out.println(AA.a);
		System.out.println(B.a);
	}
}
interface AA{
	int a = 23; // 等价于public static final int a = 23；
	
}
class B implements AA{}//正确