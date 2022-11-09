import java.util.Scanner;
public class SwithiExercise{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("請輸入a-e");
		char c1 = myScanner.next().charAt(0);
		switch(c1){
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'e':
				System.out.println("E");
				break;
			case 'f':
				System.out.println("F");
				break;
			default :
				System.out.println("你輸入有誤");
		}
		System.out.println("請輸入成績");
		double score = myScanner.nextDouble();
		if( score >= 0 && score <= 100) {
			switch((int)(score) / 60) {
				case 0:
					System.out.println("不合格");
					break;
				case 1:
					System.out.println("合格");
					break;
			}
		} else {
			System.out.println(score +"不在在0-100");
		}
		 System.out.println("請輸入月份");
		int month = myScanner.nextInt();
		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("春季");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("夏季");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("秋季");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("冬季");
				break;
			default :
				System.out.println("輸入的月份有誤（1~12）");
		
		}
	   
	}
}