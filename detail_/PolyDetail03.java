package chapter08.com.hspedu.poly_.detail_;

public class PolyDetail03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BB bb = new BB();
		System.out.println(bb instanceof BB);//t
		System.out.println(bb instanceof AA);//t
		
		//aa编译类型是AA 运行类型是BB
		AA aa = new BB();
		System.out.println(aa instanceof BB);//t
		System.out.println(aa instanceof AA);//t
		
		Object object = new Object();
		System.out.println(object instanceof AA);//f
		String str = "hello";
		System.out.println(str instanceof Object);//t
	
	}

}
class AA{
	
}
class BB extends AA{
	
}