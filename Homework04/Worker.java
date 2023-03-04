package chapter08.com.hspedu.Homework04;

public class Worker extends Employee{
//普通员工没有特殊属性
	public Worker(String name, double salary, int day, double grade) {
		super(name, salary, day, grade);
		// TODO 自动生成的构造函数存根
	}
	//濮阳员工和Employee输出工资情况一样，所以直接调用父类的println（）
	@Override
		public void println() {
			// TODO 自动生成的方法存根
			super.println();
		}
	
	
}
