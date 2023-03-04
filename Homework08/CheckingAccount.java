package chapter08.com.hspedu.Homework08;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(double initalBlance) {
		super(initalBlance);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void deposit(double amount) {
		// TODO 自动生成的方法存根
		super.deposit(amount - 1);//巧妙的使用了父类的 deposit方法
		//1 块钱的手续费
	}
	@Override
	public void withdraw(double amount) {
		// TODO 自动生成的方法存根
		super.withdraw(amount + 1);
		//1 块钱的手续费
	}
	
}
