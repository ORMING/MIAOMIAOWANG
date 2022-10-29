public class ForceConvert {
	public static void main(String[] args) {
		//演示强制類型轉換
		int n1 = (int)1.9;
		System.out.println("n1=" + n1);//1
		
		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b2" + b1);//-48
		//强制轉換符號只能對最近的操作數生效，往往使用小括號提升優限度
		//int x = (int)10*3.5+6*1.5;//編譯錯誤；本意是想double->int
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);
		
		//char類型可以保存int常量值，但不能保存int變量只，如果需要必須强轉
		char c1 = 100;//ok
		int m = 100;//ok
		//char c2 = m;//錯誤
		char c3 = (char)m;//ok
		System.out.println(c3);//100對應的字符
				
	}
}