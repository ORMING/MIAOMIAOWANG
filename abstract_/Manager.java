package chapter10.com.hspedu.abstract_;

public class Manager extends Employee{
	
	private double bonus;
	public Manager(String name, int id, double salary) {
		super(name, id, salary);
		// TODO 自动生成的构造函数存根
	}
	
	@Override
	public void work() {
		// TODO 自动生成的方法存根
		
	}

	/**
	 * @return bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus 要设置的 bonus
	 */
	public void setBonus(double bonus) {
		System.out.println("经理" + getName() + "工作中");;
	}
}
