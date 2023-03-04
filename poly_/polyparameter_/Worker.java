package chapter08.com.hspedu.poly_.polyparameter_;

public class Worker extends Employee{

	public Worker(String name, double salary) {
		super(name, salary);
		// TODO 自动生成的构造函数存根
	}
	public void work() {
		System.out.println("普通员工"+ getName() + "正在工作");
	}
	
	public double getAnnual() {//因为普通员工没有其他收入，则直接调用父类
		return super.getAnnual();
	}
}
