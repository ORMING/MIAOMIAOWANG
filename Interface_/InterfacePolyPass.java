package chapter10.com.hspedu.Interface_;
/*
 * 演示多态传递现象
 */
public class InterfacePolyPass {
	public static void main(String[] args) {
		//接口类型可以指向实现，实现了该接口的类的实例
		IG ig = new Teacher();
		//如果IG继承了 IH 接口，而Teacher 类实现了 IG接口
		//那么，实际上就相当于 Teacher 类也实现了 IH接口
		//这就是所谓的 多态传递现象
		IH ih = new Teacher();
	}
}
interface IH {
	void hi();
}
interface IG extends IH{}
class Teacher implements IG{

	@Override
	public void hi() {
		// TODO 自动生成的方法存根
		
	}
	
}
