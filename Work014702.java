public class Work014702{
	public static void main(String[] args) {
		for(int n =100;n<1000;n++)	{
			int n1 = n / 100;
			int n2 = n % 100 / 10;
			int n3 = n % 10;
			if(n == n1 * n1 * n1 + n2 * n2 * n2 +n3 * n3 * n3) {
				System.out.println(n +"是水仙花數");
			}else {
//				System.out.println(n +"不是是水仙花數");
			}
		}
	}
}