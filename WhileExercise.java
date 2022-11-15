public class WhileExercise{
	public static void main(String[] args) {
		int start = 50;
		int end =200;
		int multiple =2;
		while(start <= end) {
			if(start % multiple == 0) {
				System.out.println(start);
			}
			start++;
		}
	}
}