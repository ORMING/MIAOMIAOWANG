package chapter10.com.hspedu.Interface_;

public class InterfaceDetail02 {
	public static void main(String[] args) {
		// 证明接口中的属性，是 public static final
		System.out.println(IB.n1);// 说明n1就是static
		// IB.n1 = 30;说明n1 是 final

	}
}

interface IB {
	// 接口中的属性，只能是final的，而且只能是public static final 修饰符
	int n1 = 10;// 等价于 public static final int n1 = 10;

	void hi();
}

interface IC {
	void say();
}

//接口不能继承其他的类，但是可以继承多个别的接口
interface ID extends IB, IC {

}
//接口的修饰符 只能是 public 和默认，这一点类和修饰符是一样的
//private interface IE{}

//一个类可以同时实现多个接口
class Pig implements IB, IC {

	@Override
	public void say() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void hi() {
		// TODO 自动生成的方法存根

	}

}