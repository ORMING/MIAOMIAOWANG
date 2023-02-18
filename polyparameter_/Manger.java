package chapter08.com.hspedu.poly_.polyparameter_;

public class Manger extends Employee{
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Manger(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	public void manage() {
		System.out.println("经理"+ getName() + "正在管理工作");
	}
	//重写获取年薪的方法
	public double getAnnual() {
		return super.getAnnual()+bonus;
	}
}
