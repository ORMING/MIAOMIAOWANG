package chapter10.com.hspedu.Interface_;

public class ExtendsVsInterface {
	public static void main(String[] args) {
		littleMonkey littleMonkey = new littleMonkey("悟空");
		littleMonkey.climbing();
		littleMonkey.swimming();
		littleMonkey.flying();
	}
}	
//猴子
class Monkey{
	private String name;
	
	public Monkey(String name) {
		super();
		this.name = name;
	}
	public void climbing() {
		System.out.println(getName() + "猴子会爬树");
	}
	public String getName() {
		return name;
	}
	
}
//接口
//小结： 当子类继承父类，就自动拥有父类的功能
//  如果子类需要扩展功能，就可以通过实现接口的方式拓展。
//  可以理解 实现接口 是 对java 单继承机制的一种补充

interface Fishable{
	void swimming();
}
interface Birdable{
	void flying();
}
//继承
class littleMonkey extends Monkey implements Fishable ,Birdable{

	public littleMonkey(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void swimming() {
		// TODO 自动生成的方法存根
		System.out.println(getName() + "通过学习可以想鱼儿一样游泳了");
	}
	@Override
	public void flying() {
		// TODO 自动生成的方法存根
		System.out.println(getName() + "通过学习可以想鸟儿一样飞翔了");
	}
	
}