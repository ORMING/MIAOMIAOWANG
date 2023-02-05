package com.hspedu.encap;

public class Encapsulation01 {
	public static void main(String[] args) {
		Person person = new Person();
//		person.name = "jack";
//		person.age = 3000;
		person.setName("jack");
		person.setAge(30);
		person.setSalary(30000);
		System.out.println(person.info());
		System.out.println(person.getSalary());
		
		//如果我们直接使用构造器指定属性
		Person smith = new Person("smith",2000,5000);
		System.out.println(smith.info());
		//绕过了get的验证步骤
		
	}
}
class Person{
	public String name;
	private int age;
	private double salary;
	
	//构造器shift+alt+s（eclips用）
	public Person() {
	}
	//有三个属性的构造器
	public Person(String name, int age, double salary) {
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
		//我们可以将set方法写在构造器中这样仍然可以验证
		setName(name);
		setAge(age);
		setSalary(salary);
	}

	//自己写setxxx和getxxx太慢，可以使用快捷键shift+alt+s（eclips用）
	//如果要使用快捷键shift+alt+s需要先设置主类
	//第一次，我们要先点击形式运算程序，后面就可以用了
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//加入对数据的校验
		if(name.length() >= 2 && name.length() <= 6) {
			this.name = name;
		}else {
			System.out.println("名字长度不对需要（2-6）个字符，默认名字");
			this.name = "无人名";
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//判断
		if(age>=1 && age<=120) {//如果是合理范围就赋值
			this.age = age;
		}else {
			System.out.println("年龄需要在1—120");
			this.age = 18;
			
		}
		
	}
	public double getSalary() {
		//可以在这里增加一个读取当前对象权限的判断
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
		
//	public void setName() {
//		this.name = name;
//		
//	}
//	public String getName() {
//		return name;
//	}自己写setxxx和getxxx太慢，可以使用快捷键shift+alt+s（eclips用）
	
	//写一个方法返回属性信息
	public String info() {
		return"信息为name="+name+"age="+age+"薪水="+salary;
	}
	
}
