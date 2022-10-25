//演示转义字符的应用
public class ChangeChar{
	//编写一个main方法
	public static void main(String[] args) {
		//t:一个制表位，实现对齐的功能
		System.out.println("北京\t天津\t上海");
		//\n ：换行符
		System.out.println("jack\nsmith\nmary");
		//\\ ：一个\
		System.out.println("C:\\\\Windows\\System32\\cmd.exe");
		//\" ：一个"
		System.out.println("皇上说:\"萨格尔王\"");
		//\` ：一个`
		System.out.println("皇上说:\'萨格尔王\'");
		//\r ：一个回车 
		System.out.println("韩顺平教育\r北京");
		//课堂练习
		System.out.println("书名\t作者\t价格\t销量\t\n三国\t罗贯中\t120\t1000");
	}
}