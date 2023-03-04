package chapter08.com.hspedu.Homework08;

public class BankAccount {
	private double balance;//余额
	public BankAccount(double initalBlance) {
		this.balance = initalBlance;
	}
	//存款
	public void deposit(double amount) {
		balance += amount;
	}
	//取款
	public void withdraw(double amount) {
		balance -= amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
