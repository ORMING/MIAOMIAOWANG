import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args) {
//		Scanner myScanner = new Scanner(System.in);
//		double totalScore = 0;//全校總成績
//		int passNum = 0;//及格人數
//		int classNum = 3;
//		int stuNum = 5;
//		for(int j = 1; j <= classNum; j++) {
//			double sum = 0;//班級平均分
//			for(int i = 1;i <= 5;i++) {
//				System.out.println("輸入"+j+"班第"+i+"人成績");
//				double score = myScanner.nextDouble();
//				if(score >= 60) {
//					passNum++;
//				}
//				sum += score;
//				System.out.println("成績為"+ score);
//			}
//			totalScore += sum;
//			System.out.println("平均分為"+ (sum/stuNum));
//		}
//		System.out.println("縂平均分為" + (totalScore/(classNum*stuNum)));
//		System.out.println("及格人數為" + passNum);
//	
	for(int x = 1; x <= 9 ; x++) {
		for(int y = x ; y <= 9 ; y++) {
			System.out.print(x +"*"+ y +"="+(x*y)+"\t");
		} 
		System.out.print("\n");
	}
	
	
	}
}