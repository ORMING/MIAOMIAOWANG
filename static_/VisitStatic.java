package chapter10.com.hspedu.static_;

public class VisitStatic {
	public static void main(String[] args) {
		//类名.类变量名
		//类变量是随着类加载而创建的，所以没有创建对象实例也可以访问
		System.out.println(A.name);
		A a = new A();
		//通过对象名.类变量名
		System.out.println(a.name);
	}
}
class A{
	//类变量
	//类变量也必须遵守访问权限规则
	public static String name = "喵喵喵";
	//普通属性/普通成员变量/非静态属性/非静态成员变量/实例变量
	private int num = 10; 
	
}
