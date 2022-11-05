public class BitOperator02{
	public static void main(String[] args) {
		System.out.println(1 >> 2); //00000001=>00000000.01(取整）本質是1/2/2=0
		System.out.println(1 << 2); //00000001=>00000100 本質上1*2*2=4
		System.out.println(4 << 3);//4*2*2*2=32
		System.out.println(15 >> 3);//15/2/2/2=1
	}
}