public class VarParameterDetail{
	public static void main(String[] args) {
		//细节：可变参数的实参可以为数组
		int[] arr = {1,2,3};
		T3 t1 = new T3();
		t1.f1(arr);
	}
}
class T3{
	public void f1(int...nums) {
		System.out.println("长度=" + nums.length);
		//细节：可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数再最后
		//一个形参列表里只能有一个可变参数
	}
}