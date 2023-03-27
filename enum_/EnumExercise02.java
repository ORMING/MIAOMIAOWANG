package chapter11.hspedu.enum_;

public class EnumExercise02 {
	public static void main(String[] args) {
		//获取到所有的枚举对象
		Week[] weeks = Week.values();
		//遍历,使用增强for
		for(Week week : weeks) {
			System.out.println(week);
		}
	}
}
enum Week{
	//定义Week中的枚举对象
	MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THUTSDAY("星期四"),
	FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
	
	private String name;

	private Week(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return name;
	}
	
}