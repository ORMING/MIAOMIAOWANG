package chapter10.com.hspedu.static_;

public class StaticExercise02 {
	public static void main(String[] args) {
		System.out.println("Number of total is" + Person.getTotalPerson());
		Person p1 = new Person();
		System.out.println("Number of total is" + Person.getTotalPerson());
	}
}
class Person{
	private int id;
	private static int total = 0;
	public static int getTotalPerson() {
		//id++;//错误注销
		return total;
	}
	public Person() {//构造器
		total++;
		id = total;
	}
}
