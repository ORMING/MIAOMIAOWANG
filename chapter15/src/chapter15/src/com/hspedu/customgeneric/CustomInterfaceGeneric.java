package chapter15.src.com.hspedu.customgeneric;

public class CustomInterfaceGeneric {
	public static void main(String[] args) {
		
	}
}
/*
 * 1.接口中,静态成员也不能使用泛型
 * 2.泛型接口的类型,在继承接口或者实现接口时确定
 */

//实现接口时,直接指定泛型接口的类型
//给U指定了Integer 给 R制定了 Float
class BB implements IUsb<Integer,Float>{

	@Override
	public Float get(Integer u) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void hi(Float r) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void run(Float r1, Float r2, Integer u1, Integer u2) {
		// TODO 自动生成的方法存根
		
	}
	
}
@SuppressWarnings("rawtypes")
//没有指定类型,默认Object
class CC implements IUsb{//等价于 class CC implements IUsb<Object,Object>

	@Override
	public Object get(Object u) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void hi(Object r) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void run(Object r1, Object r2, Object u1, Object u2) {
		// TODO 自动生成的方法存根
		
	}
	
}

interface IUsb<U,R>{
	int n = 10;
	//U name;不能这样使用
	
	
	//普通方法中,可以使用接口泛型
	R get(U u);
	void hi(R r);
	void run(R r1, R r2, U u1, U u2);
	//在jdk8中,可以在接口中,使用默认方法,也是可以使用泛型
	default R method(U u) {
		return null;
	}
}
//在继承接口,指定泛型接口的类型
interface IA extends IUsb<String,Double>{
	
}
//当我们去实现IA接口时,因为IA在继承IUsu 接口时,指定了U 为String R为Double
//,在实现IU方法时,使用String替换U,使用Double替换R
class AA implements IA{

	@Override
	public Double get(String u) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void hi(Double r) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void run(Double r1, Double r2, String u1, String u2) {
		// TODO 自动生成的方法存根
		
	}
	
}
