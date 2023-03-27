package chapter11.hspedu.annotation_;



public class Override_ {

}
class Father{//父类
	public void fly() {
		System.out.println("father fly...");
	}
	
}
class Son extends Father {//子类
	//1 @Override 注解放在fly方法上,表示fly方法时重写了父类的fly
	//2 这里没有写@Override 还是重写了父类的fly
	//3 如果你写了@Override注解,编译器就回去检查该方法是否真的重写了父类的
	// 方法,如果的确重写了,则编译通过,如果没有构成重写,则编译错误
	//4 看看@Override的定义
	//@Target(ElementType.METHOD)//@Target是修饰注解的注解,成为元注解
	//@Retention(RetentionPolicy.SOURCE)
	//public @interface Override {//这时一个注解类不是接口
	//}
	
	
	@Override
	public void fly() {
		// TODO 自动生成的方法存根
		System.out.println("Son fly");
	}
}