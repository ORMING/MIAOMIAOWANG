import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		char answer ;
		do {
		System.out.println("還錢不y/n");
		answer = myScanner.next().charAt(0);
		System.out.println("他的回答是" + answer);
		}while(answer != 'y');
		System.out.println("終於還錢了");
	}
}