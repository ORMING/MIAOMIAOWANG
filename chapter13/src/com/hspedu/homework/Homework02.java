package com.hspedu.homework;

public class Homework02 {
	
	public static void main(String[] args) {
		String name = "jaka";
		String pwd = "123343";
		String email = "ssefn8964@gamil.com";
		
		try {
			userRegister(name,pwd,email);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
	}
	//1 先编写方法 userRegister(String name, String pwd, String email)
	//2 争对 输入的内容进行效验,如果有问题,就抛出异常,给出提示
	//3 单独写一个方法用于判断,密码是否全是数字 返回boolean
	public static void userRegister(String name, String pwd, String email) {
		
		//可再加入一些效验
		if(!(name != null && pwd != null && email != null)) {
			throw new RuntimeException("参数不能为空");
		}
		
		
		int userLength = name.length();
		if(!(userLength >= 2 && userLength <= 4)) {
			throw new RuntimeException("用户名长度为2或者3或者4");
		}
		
		if(!(pwd.length() == 6 && isDigital(pwd))) {
			throw new RuntimeException("密码错误长度或类型不对");
		}
		
		int i = email.indexOf('@');
		int j = email.indexOf('.');
		if(!(i > 0 && j > i)) {
			throw new RuntimeException("邮箱@应在.之后");
		}
		System.out.println("注册成功");
	}
	public static boolean isDigital(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] < '0' || chars[i] > '9') {//通过字符的阿兹克码大小来判断
				return false;
				
			}
		}
		return true;
	}
	
	
}
