public class Object{
	
	public static void main(String[] args) {
		//使用oop解決
		Cat cat1 = new Cat();//創建一隻貓
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 10;
		Cat cat2 = new Cat();//創建第二只
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 20;
		//使用信息
		System.out.println("第一只貓的信息"+cat1.name + " " + cat1.age + " " + cat1.color + cat1.weight);
		System.out.println("第二只貓的信息"+cat2.name + " " + cat2.age + " " + cat2.color + cat2.weight);
	}
}
//使用面向對象的方式來解決養貓問題
class Cat{//定義貓類這個數據類型
	//屬性，成員變量
	String name ;//名字
	int age;//年齡
	String color;//顔色
	int weight = 20;//體重
	}