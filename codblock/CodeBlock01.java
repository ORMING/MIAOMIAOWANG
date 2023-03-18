package chapter10.com.hspedu.codblock;

public class CodeBlock01 {
	public static void main(String[] args) {
		Movie movie = new Movie("喵喵");
		Movie movie2 = new Movie("123", 0);
		Movie movie3 = new Movie("1234", 0, null);
	}
}
class Movie{
	private String name;
	private double price;
	private String director;
	//三个构造器重载
	//下面三个构造器都有相同的语句
	//这样代码看起来比较冗余
	//这时我们可以吧相同的部分放入到一个代码块中即可
	//这样的话不过调用哪个构造器创建对象都会先调用代码块的内容
	//代码块的调用优先于构造器
	{
		System.out.println("电影屏幕打开");
		System.out.println("广告开始");
		System.out.println("电影正式开始");
	}
	public Movie(String name) {
//		System.out.println("电影屏幕打开");
//		System.out.println("广告开始");
//		System.out.println("电影正式开始");
		System.out.println("Movie(String name)被调用" + name);
		this.name = name;
	}
	public Movie(String name, double price) {
//		System.out.println("电影屏幕打开");
//		System.out.println("广告开始");
//		System.out.println("电影正式开始");
		System.out.println("Movie(String name, double price) 被调用" + name);
		
		this.name = name;
		this.price = price;
	}
	public Movie(String name, double price, String director) {
//		System.out.println("电影屏幕打开");
//		System.out.println("广告开始");
//		System.out.println("电影正式开始");
		System.out.println("Movie(String name, double price, String director)" + name);
		this.name = name;
		this.price = price;
		this.director = director;
	}
	
	
	
}