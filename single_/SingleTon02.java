package chapter10.com.hspedu.single_;
/*
 * 懒汉式 单例模式
 */
public class SingleTon02 {
	public static void main(String[] args) {
		Cat instance = Cat.getInstance();
		System.out.println(instance);
		
		//再次调用
		Cat instance2 = Cat.getInstance();
		System.out.println(instance2);
	}
}
//希望在程序运行中，只能创建一个Cat对象
class Cat{
	private String name;
	private static Cat cat;//默认是null
	
	//步骤
	//1依然私有化
	//2定义一个static静态属性对象
	//3提供一个public的static方法，可以返回一个cat对象
	//4懒汉式，只有当用户使用getInstance时，才返回cat对象，后面再次调用时，会返回上次创建的cat对象
	//从而保证了单例
	private Cat(String name) {
		System.out.println("构造器调用");
		this.name = name;
	}
	public static Cat getInstance() {
		if(cat == null) {//如果没有小猫
			cat = new Cat("修可爱");
			
		}
		return cat;
	}
	 @Override
	    public String toString() {
	        return "name=" + name ;
	    }
}
