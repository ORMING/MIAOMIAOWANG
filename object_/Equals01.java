package chapter08.com.hspedu.object_;

public class Equals01 {
	public static void main(String[] args) {
		A a = new A();
		A b = a;
		A c = b;
		System.out.println(a == c);//t
		System.out.println(b == c);//t
		B bobj = a;
		System.out.println(bobj == c);//t
		//比较引用对象时，只要地址相同 == 就为真
		int num1 = 10;
		double num2 = 10.0;
		System.out.println(num1 == num2);////基本数据类型，判断值是否相等
		
	}
}
class B{}
class A extends B{}