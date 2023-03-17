package chapter10.com.hspedu.static_;

public class StaticMethod {
	public static void main(String[] args) {
		//创建两个学生交学费
		Stu tom = new Stu("Tom");
//		tom.payFee(100);
		Stu.payFee(100);
		Stu mary = new Stu("mary");
//		mary.payFee(200);
		Stu.payFee(200);
		
		//输出当前收到的总学费
		Stu.shouFee();
		
		//如果我们希望不创建实例，也可以使用某个方法（即当作工具来用）
		//这时，吧方法做成静态方法时非常合适
		System.out.println("9开方的结果"+ Math.sqrt(9));
	}
}
class Stu{
	private String name;
	//定义一个静态变量来累积学生学费
	private static double fee = 0;
	public Stu(String name) {
		super();
		this.name = name;
	}
	//1当方法使用了static修饰后，该方法就是静态方法
	//2静态方法就可以访问静态属性/变量
	public static void payFee(double fee) {
		Stu.fee += fee;
		System.out.println("总学费有：" + Stu.fee);
	}
	public static void shouFee() {
		System.out.println("总学费有：" + Stu.fee);
	}
}
