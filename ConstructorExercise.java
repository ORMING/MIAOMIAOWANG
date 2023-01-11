public class ConstructorExercise{
	public static void main(String[] args) {
		Person04 p1 = new Person04();//无构造器
		System.out.println(p1.name+p1.age);
		Person04 p2 = new Person04("喵",28);
		System.out.println(p2.name+p2.age);
	}
}
class Person04{
	String name;
	int age;
	public Person04 () {//无参构造器，设置所有人age为18
		age = 18;
	}
	public Person04 (String pName,int pAge) {
		name = pName;
		age = pAge;
	}
}