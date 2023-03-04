package chapter08.com.hspedu.poly_;

public class Poly01 {

	public static void main(String[] args) {
		Master tom = new Master("tom");
		Dog dog = new Dog("大黄"); 
		Bone bone = new Bone("大骨棒~");
		
		tom.feed(dog, bone);
		
		Cat cat = new Cat("加菲");
		Fish fish = new Fish("黄花鱼");
		System.out.println("=======");
		tom.feed(cat, fish);
		
		//添加 给小猪喂米饭
		Pig pig = new Pig("皮杰");
		Rice rice = new Rice("剩饭");
		System.out.println("=======");
		tom.feed(pig, rice);
	}

}
