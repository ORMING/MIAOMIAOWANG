package chapter11.hspedu.enum_;

public class Enumeration02 {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
	}
}
//演示定义枚举实现
//1 将构造器私有,目的防止 直接 new
//2 去掉setXXX相关的方法,防止属性被修改
//3 再Season内部,直接创建固定的对象
//4 优化,可以再加入 final 修饰符

class Season{
	private String name;
	private String desc;//描述
	
	//定义了四个对象  (final修饰的常量名字 一般都全部大写)
	public static final Season SPRING = new Season("春天", "温暖");
	public static final Season WINTER = new Season("冬天", "寒冷");
	public static final Season SUMMER = new Season("夏天", "炎热");
	public static final Season AUTUMN = new Season("秋天", "凉爽");
	
	
	private Season(String name, String desc) {
		super();
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
