import java.util.Scanner;
public class IfTest02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("輸入季節‘旺’或者‘淡’");
		char season = myScanner.next().charAt(0);
		System.out.println("輸入年齡’");
		int age = myScanner.nextInt();
		if(season == '旺') {
			if(age >= 18 && age <= 60) {
				System.out.println("票價為60");
			}else if(age < 18) {
				System.out.println("票價為30");
			}else if(age > 60) {
				System.out.println("票價為20");
			}
		}else if(season == '淡') {
			if(age >= 18 && age <= 60) {
				System.out.println("票價為40");
		}else {
			System.out.println("票價為20");
		}
		}
	}
}