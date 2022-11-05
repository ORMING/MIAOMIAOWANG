import java.util.Scanner;//表示把java.util下的Scanner類導入
public class Input{
	public static void main(String[] args) {
try (//		演示接受用戶輸入
		//		步驟
		//		Scanner類 表示 簡單文本掃描器，在java.util包
		//		1.引入/導入 Scanner 類所在的包
		//		2.創建 Scanner 對象，new創建一個對象，體會
		//		  myScanner 就是 Scanner類的對象
		Scanner myScanner = new Scanner(System.in)) {
			//3接收用戶輸入了，使用相關的方法
			System.out.println("請輸入名字");
			String name = myScanner.next();//接收用戶輸入字符串
			//儅程序執行到 next方法時，會等待用戶輸入
			System.out.println("請輸入年齡");//
			int age = myScanner.nextInt();//接收用戶輸入int
			System.out.println("請輸入薪水");
			double sal = myScanner.nextDouble();//接收用戶輸入double
			System.out.println("人的信息如下：");
			System.out.println("名字" + name + "年齡" + age + "薪水" + sal);
		}
	}
}