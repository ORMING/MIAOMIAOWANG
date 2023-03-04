package chapter08.com.hspedu.Homework05;

public class Scientist extends Employee {
	public Scientist(String name, double sal) {
		super(name, sal);
		// TODO 自动生成的构造函数存根
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	private double bonus;
	
	public void println() {
		System.out.println(getName() + "工资为" + (getSal()*getSalMonth()+bonus));
	}
}
