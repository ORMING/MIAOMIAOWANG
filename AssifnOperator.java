public class AssifnOperator {
	public static void main(String[] args) {
		int n1 = 10;
		n1 += 4;//n1 = n1 + 4 =14
		System.out.println(n1);
		n1 /= 3;//n1 = n1 / 3 =4
		System.out.println(n1);
		
		//複合賦值運算符會進行類型轉換
		byte b = 3;
		b += 2;//等價b = (byte)b + 2;
		b++;//b = (byte)(b + 1);
	}
}