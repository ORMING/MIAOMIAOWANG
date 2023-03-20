package chapter10.com.hspedu.Interface_;



public interface AInterface {
	//写属性
	public int n1 =10;
	//写方法
	public abstract void hi();//在接口中抽象方法可以省略abstract关键字
	//在jdk8之后，可以有默认方法，之前全是抽象方法
	//如果需要使用默认方法，需要使用default关键字
	public default void ok() {
		System.out.println("ok....");
	}
	//在jdk8之后，可以有静态方法
	public static void cry() {
		System.out.println("cry...");
	}
}
//如果一个类 implements实现一个接口需要将该接口的所有抽象方法都实现
class A implements AInterface{
	
	@Override
	public void hi() {
		// TODO 自动生成的方法存根
		
	}
	
}