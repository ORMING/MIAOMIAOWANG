public class TernaryOperatorDetail{
	public static void main(String[] arge) {
		//表達式1和表達式2要為可以賦給接收變量的類型（或可以自動轉換）
//		int a = 3;
//		int b = 8;
//		int c = a > b ? a : b;
//		int a = 3;
//		int b = 8;
//		int c = a > b ? 1.1 : 3.4; X
		int a = 3;
		int b = 8;
		int c = a > b ? (int)1.1 : (int)3.4;//可以
		double d = a> b ? a : b + 3;//可以的，滿足int->double
		//實現三個數的最大值
		int n1 = 55;=
		int n2 = 33;
		int n3 = 123;
		//1先得到n1和n2中的最大數，保存到max1
		//2然後求出max1 和 n3中的最大值
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大數（plan1）=" + max2);
		//使用一條語句實現
		int max0 = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println("最大數（plan2）=" + max0);
	}
}