package chapter08.com.hspedu.Homework13;

public class Teacher extends Person {
	private int work_age;

	public Teacher(String name, char sex, int age, int work_age) {
		super(name, sex, age);
		this.work_age = work_age;
	}

	public int getWork_age() {
		return work_age;
	}

	public void setWork_age(int work_age) {
		this.work_age = work_age;
	}
	public void teach() {
		System.out.println("我承诺会认真教学");
	}
	@Override
	public String play() {
		// TODO 自动生成的方法存根
		return super.play() + "爱玩象棋";
	}
	public void printInfo() {
		System.out.println("老师的信息");
		System.out.println(super.basicInfo());
		System.out.println("工龄:" + work_age);
		teach();
		System.out.println(play());
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return super.toString();
	}
}
