package chapter10.com.hspedu.Interface_;

public class InterfaceExercise02 {
	public static void main(String[] args) {
		new C1().pX();
	}
}
interface A1{
	int x = 0;
}
class B1{
	int x = 1;
}
class C1 extends B1 implements A1{
	public void pX() {
//		System.out.println(x);//错误x有歧义,
		//可以明确指定x
		//访问接口 x 就使用 A1.x
		//访问父类的 x 就用 super.x
		System.out.println(A1.x + " " + super.x);
	}
}