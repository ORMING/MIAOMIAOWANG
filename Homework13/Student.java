package chapter08.com.hspedu.Homework13;

public class Student extends Person {
	
	private String stu_id;

	public Student(String name, char sex, int age, String stu_id) {
		super(name, sex, age);
		this.stu_id = stu_id;
	}

	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	
	public void study() {
		System.out.println("我承诺会好好学习");
	}
	@Override
	public String play() {
		// TODO 自动生成的方法存根
		return super.play() + "爱玩足球";
	}
	
	public void printInfo() {
		
		System.out.println("学生的信息");
		System.out.println(super.basicInfo());
		System.out.println("学号:" + stu_id);
		study();
		System.out.println(play());
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return super.toString();
	}
}
