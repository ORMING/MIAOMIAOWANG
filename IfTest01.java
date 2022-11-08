import java.util.Scanner;
public class IfTest01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("輸入成績");
		double score = myScanner.nextDouble();
		System.out.println("輸入性別");
		char gender = myScanner.next().charAt(0);
		if(score > 8.0) {
			if(gender == '男') {
				System.out.println("進入男子組");
			}else if(gender == '女'){
				System.out.println("進入女子組");
			}
		}else{
				System.out.println("被淘汰");
			}
	}
}