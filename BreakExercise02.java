import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;
		for(int i = 1; i <= 3;i++) {
			System.out.println("請輸入名字");
			name = myScanner.next();
			System.out.println("請輸入密碼");
			passwd = myScanner.next();
			if("丁真".equals(name) && "666".equals(passwd)) {
				System.out.println("登錄成功");
				break;
			}
			chance--;
			System.out.println("你還有"+ chance +"次機會");
		}
	}
}