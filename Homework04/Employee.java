package chapter08.com.hspedu.Homework04;

import java.util.jar.Attributes.Name;

public class Employee {
	private String name;
	private double daySal;
	private int workDay;
	//分析出还有一个属性等级
	private double grade;
	
	public void println( ) {
		System.out.println();
		System.out.println("name" + name + "工资"+ workDay * daySal * grade);
	};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return daySal;
	}
	public void setSalary(double salary) {
		this.daySal = salary;
	}
	public double getDay() {
		return daySal;
	}
	public void setDay(int day) {
		this.daySal = day;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Employee(String name, double salary, int day, double grade) {
		super();
		this.name = name;
		this.daySal = salary;
		this.daySal = day;
		this.grade = grade;
	}
	
	
}
 