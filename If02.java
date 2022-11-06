import java.util.Scanner;

public class If02{
	public static void main(String[] args) {
		//定義一個scanner 對象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("請輸入年齡");
		//把年齡保存到一個變量int age
		int age = myScanner.nextInt();
		//使用if-else判斷，輸出對應信息
		if(age > 18) {
			System.out.println("你年齡大於18，要對自己行爲負責，送入集中營");
		}else {//雙分支
			System.out.println("你的年齡不大這次放過你了");
		}
		System.out.println("程序繼續運行");
	}
}