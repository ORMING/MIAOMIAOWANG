public class BreakDetail{
	public static void main(String[] args) {
		abc1:
			for(int j = 0; j < 10; j++) {
			abc2:
				for(int i = 0; i < 10; i++) {
					if(i == 2) {
						break;
					}
					System.out.println("i=" + i);
				}
			}
	}
}