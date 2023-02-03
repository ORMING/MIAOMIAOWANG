package chapter08.com.use;

import chapter08.com.xiaoqiang.Dog;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog);//chapter08.com.xiaoqiang.Dog@7c30a502
		chapter08.com.xiaoming.Dog dog1 = new chapter08.com.xiaoming.Dog();
		System.out.println(dog1);//chapter08.com.xiaoming.Dog@2133c8f8
	}

}
