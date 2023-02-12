package chapter08.com.hspedu.override_;

public class OverrideExercise {
	public static void main(String[] args) {
		Person person = new Person("包子", 64);
		System.out.println(person.say());
		Student student = new Student("黄旭东", 45, 3, "43");
		System.out.println(student.say());
	}
}
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.setName(name);
		this.setAge(age);
	}
	public String say() {
//		System.out.println("我是" + name +"现在" + age +"岁了");
		return "我是" + getName() +"现在" + getAge() +"岁了";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Student extends Person{
	private int id;
	private String score;
	public Student(String name, int age, int id, String score) {
		super(name, age);
		this.id = id;
		this.score = score;
	}
	public String say() {
//		System.out.println("我是" + name +"现在" + age +"岁了");
		return "我是" + getName() +"现在" + getAge() +"岁了" + "id是" + id + "score是" + score;
	}
	
}
