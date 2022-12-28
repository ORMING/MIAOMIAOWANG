public class MethodParameter01{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//创建AA对象
		AB c = new AB();
		c.swap(a, b);//调用swap
		System.out.println("a=" + a + "b=" + b);
	}
}
class AB{
	public void swap(int a,int b) {
		System.out.println("\na和b交换前的值" + a + "\tb=" + b);
		//ab完成交换
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na和b交换后的值a=" + a + "\tb=" + b);
	}
}