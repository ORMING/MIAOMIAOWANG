package com.hspedu.encap;

public class AccountTest {
	public static void main(String[] args) { 
		//创建Account
		Account account = new Account();
		account.setName("jack");
		account.setBalance(67);
		account.setPassword("123456");
		
		account.showInfo();
	}
}
