package chapter08.com.hspedu.Homework04;

public class Homework04 {
	public static void main(String[] args) {
		Manager manager = new Manager("牛背", 100, 20, 1.2);
		//设置奖金
		manager.setBonus(300);
		//打印工资
		manager.println();
	}
}
