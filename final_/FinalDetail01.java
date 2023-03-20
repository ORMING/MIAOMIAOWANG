package chapter10.com.hspedu.final_;

public class FinalDetail01 {
	public static void main(String[] args) {
		new EE().cal();
	}
}
class AA{
	/*
	 * 1定义时：如果public final double TAX_RATE=0.08；
	 * 2在构造器中
	 * 3在代码块中
	 */
	public final double TAX_RATE = 0.08;//常量必须赋值，不管你在哪里赋值
	public final double TAX_RATE2;
	public final double TAX_RATE3;
	public AA() {
		TAX_RATE2 = 1.1;//在构造器里赋值
	}
	{
		TAX_RATE3 = 8.8;//在代码块中赋值
	}
}
class BB{
	/*
	 * 如果final修饰的属性是静态的，则初始化的位置只能是
	 * 1定义时 2 在静态代码块 不能再构造器中赋值
	 */
	public static final double TAX_RATE = 99;
//	public static final double TAX_RATE2;
	public static final double TAX_RATE3;
	public BB() {
//		TAX_RATE2 = 34; 不接受
	}
	static {
		TAX_RATE3 = 3.3;
	}
}
//final类不能继承，但是可以实例化对象
final class cc{}
//如果不是final类，但是含有fianl方法，则该方法虽然不能重写，但是可以被继承
//即，仍然遵守继承机制
class DD{
	public final void cal() {
		System.out.println("cal()方法");
	}
}
class EE extends DD{}
