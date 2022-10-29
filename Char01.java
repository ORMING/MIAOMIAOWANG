public class Char01{
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '喵';
		char c4 = 97;//字符型可以直接存放一個數字
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//儅輸c4的時候，會輸出97的字母a
		/*字符常量需要單引號括起來
		 * 可以允許使用轉義字符'\'來將後面的字符轉變爲特殊字符型常量比如(\t)
		 * java中char的本質是一個整數的時候，輸出時是unicode碼對應的字符
		 */
		char c5 = 's';
		System.out.println((int)c5);//輸出'a'為對應的數字
		char c6 = '喵';
		System.out.println((int)c6);//喵的對應數字
		char c7 = 21941;
		System.out.println(c7);
		System.out.println('a'+ 10);//107
		
		char c8 = 'b' + 1;//88+1
		System.out.println((int)c8);//9
		System.out.println(c8);//c

	}
}