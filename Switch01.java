import java.util.Scanner;

public class Switch01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("請輸入一個字符（a~g）");
		char c1 = myScanner.next().charAt(0);
		//Java中只要有值返回就是一個表達式
		//1表達式數據類型，應和case后的常量一致，或者是自動轉成可以比較的類型，
		//比如輸入的是字符，而常量是int
		//2switch（表達式)中表達式的返回值必須是：（byte,short,int,char,enum[枚舉],String）
		//3case子句中的值必須是常量，而不能是變量
		//4default子句是可選的，儅沒有匹配的case時，執行default
		//如果沒有default子句，也沒有匹配到任何常量則沒有輸出
		//5break語句用來在執行完一個case分支后使程序跳出swithch語句塊
		//如果沒有寫break，程序會順序運行到switch的結尾
		
		switch(c1){
			case'a':
				System.out.println("今天星期1");
				break;
			case'b':
				System.out.println("今天星期2");
				break;
			case'c':
				System.out.println("今天星期3");
				break;
			case'd':
				System.out.println("今天星期4");
				break;
			case'e':
				System.out.println("今天星期5");
				break;
			case'f':
				System.out.println("今天星期6");
				break;
			case'g':
				System.out.println("今天星期7");
				break;
			default:
				System.out.println("你輸入的字符不正確，沒有匹配");
				
		}
		System.out.println("推出了switch,繼續執行");
	}
}