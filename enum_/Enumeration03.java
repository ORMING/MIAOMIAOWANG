package chapter11.hspedu.enum_;

public class Enumeration03 {
	public static void main(String[] args) {
		System.out.println(Season02.SPRING);
		System.out.println(Season02.AUTUMN);
		System.out.println(Season02.SUMMER);
		System.out.println(Season02.WINTER);
	}
}
//演示使用enum 关键字来实现枚举类

enum Season02{//类
	
	
	//定义了四个对象  (final修饰的常量名字 一般都全部大写)
//	public static final Season SPRING = new Season("春天", "温暖");
//	public static final Season WINTER = new Season("冬天", "寒冷");
//	public static final Season SUMMER = new Season("夏天", "炎热");
//	public static final Season AUTUMN = new Season("秋天", "凉爽");
	//1 如果使用 关键字 enum 替代 class
	//2 public static final Season SPRING = new Season("春天", "温暖"); 
	// 直接使用 SPRING("春天","温暖"); 替代  常量名(实参列表);
	//3 如果有多个常量(对象),使用,间隔即可
	//4 如果使用enum 来实现枚举,要求将定义常量对象,写在前面
	//5 如果我们使用的是无参构造器 创建常量对象, 则可以省略()
	//6 枚举对象必须放在枚举类的行首 
	SPRING("春天","温暖"),WINTER("冬天","寒冷"),SUMMER("夏天", "炎热"),AUTUMN("秋天", "凉爽");
	
//	SUMMER("春天","温暖"),WHAT(),WHY;
	private String name;
	private String desc;//描述
	
	private Season02() {//无参构造器
		
	}
	
	
	private Season02(String name, String desc) {
		
		this.name = name;
		this.desc = desc;
	}


	public String getName() {
		return name;
	}


	public String getDesc() {
		return desc;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "Season{ " + 
				"name= '" + name + '\'' +
				",desc= '" + desc + '\''+	
				'}' ;
	}

}
