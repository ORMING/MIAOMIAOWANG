package chapter15.src.com.hspedu.customgeneric;
@SuppressWarnings("all")
public class CustomGeneric_ {
	public static void main(String[] args) {
		//T=Double,R=String,M=Integer
		Tiger<Double,String,Integer> g = new Tiger<>("john");
		g.setT(19.9);
//		g.setT("yy");类型不对
		System.out.println(g);
		Tiger g2 = new Tiger("john");
		g2.setT("yy");
		System.out.println("g2="+g2);
	}
}
//1.Tiger 後面有汎型,所以我們把 Tiger 稱爲自定義汎型類
//2.T,R,M 泛型的标识符,一般是单个大写字母
//3.泛型标识符可以有多个
//4.普通成员可以使用泛型(属性,方法)
//5.使用泛型的数组,不能初始化
//6.静态方法中不能使用类的泛型
class Tiger<T,R,M>{
	String name;
	R r;//属性使用到泛型
	M m;
	T t;
	//因为数组在new 不能确定T的类型,就无法在内存开空间	
//	T[] ts = new T[8];
	
	public Tiger(String name, R r, M m, T t) {//构造器使用泛型
		super();
		this.name = name;
		this.r = r;
		this.m = m;
		this.t = t;
	}
	
	//因为静态是和类相关的,在类加载时,对象还没有创建
	//所有,如果静态方法和静态属性使用了泛型,JVM就无法完成初始化
//	static R r2;
//	public static void m1(M m) {	
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public R getR() {//方法使用泛型
		return r;
	}
	public void setR(R r) {//返回类型使用泛型
		this.r = r;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}

	public Tiger(R r, M m, T t) {
		super();
		this.r = r;
		this.m = m;
		this.t = t;
	}

	public Tiger(String name) {
		super();
		this.name = name;
	}
}