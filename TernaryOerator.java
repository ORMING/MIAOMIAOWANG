//三元運算符
public class TernaryOerator{
	public static void mian(String[] args) {
		int a = 10;
		int b = 99;
		//解讀
		//1.a>b為false
		//2.返回b-- ，先返回b的值，然後在b--
		//3返回的結果是99
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		
	}
}