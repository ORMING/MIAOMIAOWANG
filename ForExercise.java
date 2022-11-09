public class ForExercise{
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int start = 1;
		int end = 100;
		int t = 3;
		for(int i = start; i <= end; i++) {
			if(i % t == 0) {
			System.out.println("i=" + i);
			count++;
			sum += i;
			}
			
		}
		System.out.println("個數="+ count +"縂和="+ sum);
	}
}