package chapter10.com.hspedu.static_;

public class StaticExercise03 {
	public static void main(String[] args) {
		Person02.setTotalPerson(3);//total=3
		new Person02();//total = 4 id = 4
		Person02.m();
	}
}
class Person02{
	private int id;
	private static int total = 0;
	public static void setTotalPerson(int total) {
//		this.total = total;//错误static方法不能运行this
		Person02.total = total;//0
	}
	public Person02() {
		total++;
		id = total;
	}
	public static void m(){
		System.out.println(Person02.total );
	}
}