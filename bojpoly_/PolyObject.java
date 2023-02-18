package chapter08.com.hspedu.poly_.bojpoly_;


public class PolyObject {


	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//体验对象多态特点
		//animal 编译类型就是Animal，运行类型dog
		Animail animail = new Dog();
		//因为运行时，这是就执行到该行时，animal运行类型是dog，所以cry就是dog的cry
		animail.cry();//汪汪
		
		//animail 编译类型 Anima ，运行类型是cat
		animail = new Cat();
		animail.cry();
	}

}
