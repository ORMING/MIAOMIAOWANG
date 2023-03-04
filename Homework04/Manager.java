package chapter08.com.hspedu.Homework04;

public class Manager extends Employee{
	private double bonus;//特有对象
	//创建Manager对象时奖金数额并不知道，所以构造器中不给bonus
	//可以通过setBonus赋值
	public Manager(String name, double salary, int day, double grade ) {
		super(name, salary, day, grade);
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void println( ) {
		System.out.println("经理" + getName() + "工资是" + (bonus + getDay() * getSalary() * getGrade()));

	};
}
