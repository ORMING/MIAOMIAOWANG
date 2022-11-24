import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		String[] names = {"東風","西風","南風","北風"};
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("請輸入名字");
		String findName = myScanner.next();
		int index = -1;
		for(int i = 0; i < names.length ; i++) {//逐個比較
			if(findName.equals(names[i])) {
				System.out.println("恭喜你找到" + findName);
				System.out.println("下標為" + i);
				//吧i保存到index
				index = i;
				break;
			}
		}
		if(index == -1) {//如果index沒變説明沒有找到
			System.out.println("沒有找到");
		}
	}
}