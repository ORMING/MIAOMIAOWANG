public class Work014705{
	public static void main(String[] args) {
		int i = 1;
		double sum = 0;
		while(i<=100) {
			if(i % 2 != 0) {
				sum += (double)1/i;
			}else {
				sum-= (double)1/i;
			}
			i++;
		}
		System.out.println("sum" + sum);
	}
}