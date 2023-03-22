package chapter10.com.hspedu.Interface_;

public class InterfaceDetail01 {
	public static void main(String[] args) {
		//new IA();
	}
}
//1接口不能被实例化
//2接口中所有的方法是 public方法()也可以不写默认public，接口中抽象方法，可以不用abstract 修饰
//3一个普通类实现接口，就必须将该接口的所有方法都实现
//4抽象类去实现接口时，可以不用实现接口的方法
interface IA{
	void say();
	void hi();
}
class cat implements IA{
	@Override
	public void say() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void hi() {
		// TODO 自动生成的方法存根
		
	}
}
abstract class Tiger implements IA{}
