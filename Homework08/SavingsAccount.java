package chapter08.com.hspedu.Homework08;

public class SavingsAccount extends BankAccount{
	
	//有没有新增加的属性
	private int count = 3;
	private double rate = 0.01;//利率
	
	public void earnMonthlyInterest() {//每个月初统计上个月的利息，同时重置count
		count = 3;
		super.deposit(getBalance() * rate);
	}
	
	@Override//存款
	public void deposit(double amount) {
		// TODO 自动生成的方法存根
		//判断是否还可以免手续费
		if (count > 0) {
			super.deposit(amount);
		}else {
			super.deposit(amount - 1);
		}
		count--;	
	}
	
	@Override
	public void withdraw(double amount) {
		// TODO 自动生成的方法存根
		//判断是否还可以免手续费
		if (count > 0) {
			super.withdraw(amount);
		}else {
			super.withdraw(amount + 1);
		}
		count--;	
	}
		
	
	
	
	public SavingsAccount(double initalBlance) {
		super(initalBlance);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
}
