public class ArrayExercise01{
	public static void main(String[] args) {
		char[] c = new char[26];
		for(int i = 0;i < c.length; i++) {
			c[i] = (char) ('A' + i) ;
		}
		System.out.println("======數組為=====");
		for(int i = 0;i < c.length; i++) {
			System.out.print(c[i]);
		}
	}
}