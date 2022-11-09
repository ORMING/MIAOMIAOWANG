public class For01{
	public static void main(String[] args) {
//		for(int i = 1;  i < 10; i++ ) {
//			System.out.println("包子" + i);
//		}
		int i = 1;
		for(;i < 10;  ) {
			System.out.println("包子" + i);
			i++;
		}//補充 for(;;){表示一個無限循環
		System.out.println("i="+ i);
		int count = 3;
		for (int q = 0,j = 0; q< count; q++, j+=2) {
			System.out.println("i="+q+"j="+j);
		}
	}
}