package chapter08.com.hspedu.exercise01;

public class Doctor {
	//属性
	//{name,age,job,gender,sal};
	private String name;
	private int age;
	private String job;
	private char gender;
	private double sal;
	public Doctor(String name, int age, String job, char gender, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
		this.sal = sal;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	//重写Object的equals方法
	@Override
	public boolean equals(Object obj) {
		// 比较两个对象是否相同
		if(this == obj) {
			return true;
		}
		//判断obj是否是docto及其子类
		if(!(obj instanceof Doctor)) {//不是的话
			return false;
		}
		//向下转型,因为obj的运行类型是Doctor或者其子类
		Doctor doctor = (Doctor)obj;
		return this.name.equals(doctor.name) && this.age == doctor.age &&
				this.gender == doctor.gender && this.job.equals(doctor.job) && this.sal == doctor.sal;
	
		
	}
}
