package chapter08.com.hspedu.exercise01;

public class Homework03 {
	public static void main(String[] args) {
		lecturer t1 = new lecturer("jack", 23, "教授", 2000) ;
		t1.introduce();
	}
}
class Techer{
	private String name;
	private int age;
	private String post;
	private double salary;
	//增加一个工资级别
	private double grade;

	public Techer(String name, int age, String post, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.post = post;
		this.salary = salary;
		this.grade = grade;
	}
	public void introduce() {
		System.out.println("教师" + name + "年龄" + age + "职称" +
				post + "工作" + salary + "级别" + grade);
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
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
}
class Professor extends Techer{
	

	public Professor(String name, int age, String post, double salary) {
		super(name, age, post, salary);
	}

	
	public void introduce() {
		System.out.println( "这是教授的信息" );
		super.introduce();
	}
	
	
}
class AssociateProfessor extends Techer{

	public AssociateProfessor(String name, int age, String post, double salary) {
		super(name, age, post, salary);
		// TODO 自动生成的构造函数存根
	}
	public void introduce() {
		System.out.println( "这是副教授的信息" );
		super.introduce();
	}


}
class lecturer extends Techer{

	public lecturer(String name, int age, String post, double salary) {
		super(name, age, post, salary);
		// TODO 自动生成的构造函数存根
	}
	public void introduce() {
		System.out.println( "这是讲师的信息" );
		super.introduce();
	}
	
	
}