public class Return01{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) {
				System.out.println("喵"+i);
				return;//跳出當前方法 用在main方法的時候就是直接退出程序
				//break 立即結束該循環
				//continue 立即跳到到目標循環的判斷中
			}
			System.out.println("hello 喵");
		}
		System.out.println("go on..");
	}
}