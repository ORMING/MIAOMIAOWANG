package chapter08.com.hspedu.exercise01;

public class Homework01 {
	public static void main(String[] args) {
		Person[] persons = new Person[4];
		persons [0] = new Person("李兴春1", 57, "证监会主席");
		persons [1] = new Person("胡国英", 50, "妻子");
		persons [2] = new Person("李厚儒324", 13, "儿子");
		persons [3] = new Person("李思凝23", 23, "女儿");
		Person tmp = null;//临时变量
		for(int i = 0; i < persons.length ; i++) {
			System.out.println(persons[i].getName()+persons[i].getAge()+persons[i].getJob());
		}
		//按照年龄大小排
//		for(int i = 0; i < persons.length - 1; i++) {
//			for (int j = 0; j < persons.length - 1 - i ; j++) {
//				if(persons[j].getAge()<persons[j+1].getAge()) {
//				tmp = persons[j];
//				persons[j] = persons[j+1];
//				persons[j+1] = tmp;
//			}
//			}
//		}
		//按照名字长度 getName().length()
		for(int i = 0; i < persons.length - 1; i++) {
			for (int j = 0; j < persons.length - 1 - i ; j++) {
				if(persons[j].getName().length()<persons[j+1].getName().length()) {
				tmp = persons[j];
				persons[j] = persons[j+1];
				persons[j+1] = tmp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < persons.length ; i++) {
			System.out.println(persons[i].getName()+persons[i].getAge()+persons[i].getJob());
		}
	}
}
class Person{
	private String name;
	private int age;
	private String job;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
}
