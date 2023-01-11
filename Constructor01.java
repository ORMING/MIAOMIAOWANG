public class Constructor01{
	public static void main(String[] args) {
		//当我们new一个对象时，直接通过构造器指定名字和年龄
		Person02 p1= new Person02("smith",80);
		System.out.println("p1信息");
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person02 p2= new Person02("miao");//调用第二个构造器
		System.out.println(p2.name);
	}
}
class Person02{
	String name;
	int age;
	//构造器
	//1.构造器没用返回值，也不能写void
	//2.构造器的名称和类Person一样
	//3.(String pName,int pAge) 是构造器的形参列表，规则和成员方法一样
	public Person02(String pName, int pAge) {//第一个构造器
		System.out.println("构造器被调用，完成属性初始化");
		name = pName;
		age = pAge;
		
	}
	public Person02(String pName) {//第二个构造器，不需要年龄（构造器重载）
		name =pName;
	}
}