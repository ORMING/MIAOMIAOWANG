public class DoWhileExercise01{
	public static void main(String[] args) {
		int i = 1;
		int mun  =0;
		do {
			System.out.println(i);
			mun += i;
			i++;
			
		}while(i <= 100);
		System.out.println("1~100的和為" + mun);
		
		int s = 1;
		int e = 200;
		int d1 = 5;
		int d2 = 3;
		int g = 0;
		do {
			if(s % d1 == 0 && s % d2 != 0) {
				g++;
			}
			s++;
		}while(s <= e);
		System.out.println("個數為"+ g);		
	}
}