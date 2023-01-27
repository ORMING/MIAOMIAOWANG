public class Homework0251{
	public static void main(String[] args) {
		A01 a01 = new A01();
		double[] arr = {1};
		Double res = a01.max(arr);
		if(res != null && arr.length > 0) {
			System.out.println(a01.max(arr));
		}else {
			System.out.println("arr的输入有误");
		}
		
	}
}
class A01{
	//先完成正常业务才考虑代码健壮性
	public Double max(double[] arr) {
		//保证arr至少有一个元素
		if(arr.length > 0) {
			double max = arr[0];//假定第一个就是最大值
			for(int i = 1; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
			return max;
		}else {
			return null;
		}
	}
}