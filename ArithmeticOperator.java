public class ArithmeticOperator{
	public static void main(String[] args) {
		// / 的使用
		System.out.println(10/4);//數學來看是2.5,java中是2
		System.out.println(10.0/4);//java中是2.5 Java保留位數為之前參與運算的追高精度
		double d = 10/4; // java中10/2=2, 2 =>2.0
		System.out.println(d);//是2.0
		//%取模 取余
		//在%的本質 看一個公式 a % b = a - a / b * b
		//-10 % 3 => -10 -(-10) / 3 * 3 = -10 + 9 = -1
		//10 % -3 => 10 - 10 / (-3) * (-3) = 1
		//-10 % -3 => -10 - (-10) / (-3) * (-3)= -1
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);
		//++的使用
		int i = 10;
		i++;//自增等價於 i = i + 1
		++i;//獨立情況前後效果相同等於i = i + 1
		System.out.println("i="+i);
		/*
		 * 作爲表達式使用 前++: ++i先自增后賦值 后++: i++先賦值后自增
		 */
		int j = 8;
//		int k = ++j;//等價於 j=j+1;k=j;
		int k = j++;//等價於 k=j;j=j+1;
		System.out.println("k=" + k + "j=" + j); //8 9
		
		
	}
}