package chapter08.com.hspedu.Homework05;

public class Employee {
	private String name;
	private double sal;
	private int salMonth = 12;
	
	public Employee(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void println() {
		System.out.println(name + "工资为" + sal*salMonth);
	}
	public int getSalMonth() {
		return salMonth;
	}
	public void setSalMonth(int salMonth) {
		this.salMonth = salMonth;
	}
}
