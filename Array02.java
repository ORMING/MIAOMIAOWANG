import java.util.Scanner;
public class Array02{
	public static void main(String[] args) {
		//演示 數據類型 數組名[]=new 
		//循環輸入5個數據，保存到double數組，并輸出
//		double scores[] = new double[5];//double[] scores = new double[5];也對
		double scores[];//聲明數組,這時 scores 是 null
		scores = new double[5];//分配内存空間可以存放數據
		//循環輸入  scores.length 表示數組大小
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < scores.length ; i++) {
			System.out.println("輸入第" + (i+1) + "個元素的值");
			scores[i] = myScanner.nextDouble();
			
		}
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
	}
}