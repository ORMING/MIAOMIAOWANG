package chapter08.com.hspedu.Homework05;

public class Teacher extends Employee {
	private int classDay;
	private double classSal;
	public Teacher(String name, double sal, int classDay, double classSal) {
		super(name, sal);
		this.classDay = classDay;
		this.classSal = classSal;
	}
	public int getClassDay() {
		return classDay;
	}
	public void setClassDay(int classDay) {
		this.classDay = classDay;
	}
	public double getClassSal() {
		return classSal;
	}
	public void setClassSal(double classSal) {
		this.classSal = classSal;
	}
	public void println() {
		System.out.println(getName() + "工资为" + (getSal()*getSalMonth()+classDay*classSal));
	}
	
	
}
