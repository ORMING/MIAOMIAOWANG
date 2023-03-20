package chapter10.com.hspedu.single_;

public class SingleTon01 {
	public static void main(String[] args) {
//		GirlFrind xh = new GirlFrind("小红");
//		GirlFrind xb = new GirlFrind("小白");
		//通过方法可以获取对象
		GirlFrind instance = GirlFrind.getInstance();
		System.out.println(instance);
		GirlFrind instance2 = GirlFrind.getInstance();
		System.out.println(instance2);
		System.out.println(instance == instance2);
	
}
}
//有一个类，GirlFrind
//只能有一个女朋友
class GirlFrind{
	private String name;
	
	//如何保证我们只创建一个GirlFrind对象
	//步骤(单例 饿汉式)
	//1将构造器私有化
	//2在类中直接创建
	//3提供一个公共的static方法，返回 gf对象
	private static GirlFrind gf = new GirlFrind("小红");//为了能够在静态方法中使用需要将其修饰为static
	
	private  GirlFrind(String name) {
		this.name = name;
	}
	public static GirlFrind getInstance() {
		return gf;
	} 
	@Override 
	public String toString() {
		// TODO 自动生成的方法存根
		return "GirlFriend{"+
				"name'"+name+'\''+
				'}';
	}
//	public GirlFrind(String name) {
//		this.name = name;
//	}
}