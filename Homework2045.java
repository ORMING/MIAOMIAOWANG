public class Homework2045{
	public static void main(String[] args) {
		int[]ordArr = {10,20,30};
		A03 a03 = new A03();
		int[]newArr = a03.copyArr(ordArr);
		//验证
		System.out.println("返回的元素");
		for(int i = 0;i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}
	}
}
class A03{
	public int[] copyArr(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		for(int i = 0; i < newArr.length;i++) {		
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}