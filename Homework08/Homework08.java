package chapter08.com.hspedu.Homework08;

public class Homework08 {
	public static void main(String[] args) {
//		CheckingAccount checkingAccount = new CheckingAccount(1000);
//		checkingAccount.deposit(10);
//		checkingAccount.withdraw(9);
//		System.out.println(checkingAccount.getBalance());
//		
		SavingsAccount savingsAccount = new SavingsAccount(1000);
		savingsAccount.deposit(100);
		savingsAccount.deposit(100);
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
		
		//月初，定时器自动调用重置和利息计算
		savingsAccount.earnMonthlyInterest();
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);
		savingsAccount.deposit(100);
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
	}
}
