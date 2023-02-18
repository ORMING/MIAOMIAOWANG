package chapter08.com.hspedu.poly_.detail_;

public class PolyDetail02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Base base = new Sub();
		System.out.println(base.count);//10
		Sub sub = new Sub();
		System.out.println(sub.count);//20
	}

}
class Base{//父类
	int count = 10;
}
class Sub extends Base{
	int count = 20;
}