package chapter08.com.hspedu.poly_.detail_;

public class PolyDetail {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//父类的引用指向了子类的对象
		//语法：父类类型引用名 = new 子类类型（）；
		Animal animal = new Cat();
		Object obj = new Cat();//Object 也是 Cat 的父类
		
		//1可以调用父类所有的成员 但是要遵守访问权限
		//2但是不能调用子类特有的成员
		//3因为在编译阶段，能调用那些成员是由编译类型来决定的
//		animal.catchiMouse()错误
		//4最终运行效果看的具体实现，即调用方法时，按照子类开始查找方法
		//然后调用，规则我前面我们讲的方法调用规则一致
		animal.eat();//猫吃鱼
		animal.run();//跑
		animal.show();//hello，你好
		animal.sleep();//睡
		
		
		//希望可以调用Cat 的 catchMousu方法
		//多态的向下转型
		//1语法：子类类型 引用名 = （子类类型）父类引用
		
		//问一个问题？cat 的编译类型 Cat,运行类型是Cat
		Cat cat = (Cat) animal;
		cat.eatchMouse();
		//2要求父类的引用必须指向当前目标的数据类型
		System.out.println("OK");
//		Dog dog =(Dog) animal;
	}

}
