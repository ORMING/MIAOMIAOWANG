package com.hspedu.encap;

public class Account {
	//为了封装三个属性全部做成私有的
	private String name;
	private double balance;
	private String password;
	
	public Account() {
	}
	
	public Account(String name, double balance, String password) {
		setName(name);
		setBalance(balance);
		setPassword(password);
	}
	//提供两个构造器
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>=2 && name.length()<=4) {
			this.name = name;
		}else {
			System.out.println("输入有误，长度应在2-4位,已设置为默认");
			this.name = "noname";
		}
	}
	public void setBalance() {
		if(balance>20) {
			this.balance = balance;
		}else {
			System.out.println("余额不足");
		}
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length() == 6) {
			this.password = password;
		}else {
			System.out.println("密码无效已设定为默认值");
			this.password = "000000";
		}
	}
	//显示账号信息
	public void showInfo() {
		System.out.println("账号信息 name=" + name + "余额" + balance + "密码" + password);
		//以后实际使用要加入权限验证
	}
}

