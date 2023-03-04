package chapter08.com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmalChangeSysOOP {
	//属性
	boolean loop = true;
	Scanner scanner = new Scanner(System.in);
	String keyString = "";
	//2完成零钱通明细
	//（1）可以吧收益入账和消费，保存在数组(2)可以使用对象（3）简单的话可以使用String拼接
	String details = "-----------------零钱通明细--------------------";
	//3.完成收益入账 完成功能驱动程序员增加新的变化和代码
	//定义新的变量
	double money = 0;
	double balance = 0;
	Date date = null;//date 是java.util.Date类型表示日期
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化的对象
	
	//4消费
	//定义新的变量，保存消费的理由
	String note = "";
	
	//先完成显示菜单，并可以选择
	public void mainMenu() {
		do {
			System.out.println("===============零钱通菜单(OOP)================");
			System.out.println("\t\t\t1.零钱通明细");
			System.out.println("\t\t\t2.收益入账");
			System.out.println("\t\t\t3.消费");
			System.out.println("\t\t\t4.退出系统");
			
			System.out.println("请选择（1~4）：");
			keyString = scanner.next();
			//使用switch分支控制
			switch (keyString) {
			case "1":
				this.detail();
				break;
			case "2":
				this.income();
				break;
			case "3":
				this.pay();
				break;
			case "4":
				this.exit();
				break;
				
			default:
				System.out.println("选择有误，请重新输入");
			}
		
			
		
	}while(loop);
	}
	//完成零钱通细节
	public void detail() {
		System.out.println(details);
		System.out.println();
	}
	//完成零钱入账
	public void income() {
		System.out.println("收益入账金额：");
		money = scanner.nextDouble();
		//money 的值范围应该校验，待会完善
		//找出不正确的金额的条件，然后给出提示即可，就直接break
		if(money <= 0) {
			System.out.println("收益入账金额需要大于0");
			return;
		}
		balance += money;
		//拼接收益入账信息到 details
		date = new Date();//获取当前日期
		
		details += "\n收益入账\t" + money + "\t" + sdf.format(date) +"\t" + balance ;
		
	}
	//完成消费的方法
	public void pay() {
		System.out.println("消费金额");
		money = scanner.nextDouble();
		//money 的值范围应该校验，待会完善
		if(money <= 0 || money > balance) {
			System.out.println("你的余额不足");
			return;
		}
		balance -= money;
		System.out.println("消费说明");
		note = scanner.next();
		//拼接消费入账信息到 details
		date = new Date();//获取当前日期
		
		details += "\n"+ note +"\t-" + money + "\t" + sdf.format(date) +"\t" + balance ;
		
	}
	//退出
	public void exit() {
		String choice = "";
		while(true) {//要求用户必须输入y/n否则就一直循环
			System.out.println("是否要退出系统?y/n");
		choice = scanner.next();
		if("y".equals(choice) || "n".equals(choice)) {
			break;
			}
		}
		//当用户退出while，进行判断
		if(choice.equals("y")) {
			loop = false;
		}
		
	}
}
