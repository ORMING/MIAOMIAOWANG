public class Scope01{
	public static void main(String[] args) {
		Cat01 C = new Cat01();
		C.cry();
		C.eat(); 
	}
}
class Cat01{
	//全局变量：也就是属性，作用于整个类体 Cat类：cry eat 等方法使用属性
	//属性再定义时可以直接赋值
	int age = 10;
	public void cry() {
		/* 1 局部变量一般是指成员方法中定义的变量
		 * 2 n 和 name 就是局部变量
		 * 3 n 和 name 的作用域再cry方法中
		 */
		int n = 10;
		String name = "jack";
		System.out.println("age=" + age);
	}
	public void eat() {
		System.out.println("age=" + age);
	}
}