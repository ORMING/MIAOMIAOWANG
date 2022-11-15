public class Break01{
	public static void main(String[] args) {
		for(int i = 0; i < 10 ; i++) {
			if(i==3) {
				break;//提前推出for循環
			}
			System.out.println("i=" + i);
		}
	}
}