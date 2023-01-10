public class VarParameter01{
	public static void main(String[] args) {
		HspMethod m = new HspMethod();
		System.out.println(m.sum(1,233,43));
	}
}
class HspMethod{
	//可变参数可以接收多个参数
	//使用可变参数时，可以当作数组来用 即nums 可以当做数组
	public int sum(int...nums) {
//		System.out.println("接收的参数个数" + nums.length);
//		return 0;
		int res = 0;
		for(int i= 0;i<nums.length;i++) {
			res += nums[i];
		}
		return res;
	}
}