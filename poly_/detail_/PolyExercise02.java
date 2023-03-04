package chapter08.com.hspedu.poly_.detail_;

public class PolyExercise02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Sub02 s = new Sub02();
		System.out.println(s.count);//20
		s.display();//20
		Base02 b = s;
		System.out.println(b == s);//t
		System.out.println(b.count);//10
		b.display();//20
	}

}
class Base02{
	int count = 10;
	public void display() {
		System.out.println(this.count);
	}
}
class Sub02 extends Base02{
	int count = 20;
	public void display() {
		System.out.println(this.count);
	}
}