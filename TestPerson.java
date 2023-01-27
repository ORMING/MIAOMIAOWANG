public class TestPerson{
	public static void main(String[] args) {
		Person03 p1 = new Person03("mary",20);
		Person03 p2 = new Person03("smith",30);
		
		System.out.println(p1.compareTo(p2));
	}
}
class Person03{
	String name;
	int age;
	//构造器
	public Person03(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	//compareTo比较方法
	public boolean compareTo(Person03 p) {
		return this.name.equals(p.name) && this.age == p.age;
		
	}
}