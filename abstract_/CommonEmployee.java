package chapter10.com.hspedu.abstract_;

public class CommonEmployee extends Employee {

	public CommonEmployee(String name, int id, double salary) {
		super(name, id, salary);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void work() {
		// TODO 自动生成的方法存根
		System.out.println("普通员工" + getName() + "工作中");
	}
}
