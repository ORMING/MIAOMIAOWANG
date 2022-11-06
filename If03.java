import java.util.Scanner;
public class If03{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("請輸入信用分(1~100)");
		int grade = myScanner.nextInt();
		if(grade >= 1 && grade <= 100){
			if(grade == 100) {
				System.out.println("信用極好");
			}else if(grade > 80 && grade <= 99){
				System.out.println("信用優秀");
			}else if(grade >= 60 && grade <= 80) {
				System.out.println("信用一般");
			}else {
				System.out.println("信用不及格");	
			}
		}else {
			System.out.println("信用分需要1-100，請重新輸入");
		}
	}
}