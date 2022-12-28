public class MethodParameter02{
	public static void main(String[] args) {
		//测试
		AC b = new AC();
		int[] arr = {1,2,3};
		b.test100(arr);//调用方法
		System.out.println("main的arr数组");
		//遍历数组
		System.out.println("test100的 arr数组");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
class AC{
	//AC类中编写一个方法test100，
	//可以接收一个数组，在方法中修改该数组，看看原来数组是否变化
	//
	public void test100(int[] arr) {
		arr[0]=200;
		//遍历数组
		System.out.println("test100的 arr数组");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}