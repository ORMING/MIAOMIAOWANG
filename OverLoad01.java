public class OverLoad01{
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
		System.out.println(mc.calculate(1, 2.2));
		System.out.println(mc.calculate(1.1, 2));
		System.out.println(mc.calculate(1, 2 , 3));
	}
}
class MyCalculator{
	//两个整数和
	public int calculate(int n1,int n2) {
		System.out.println("calculate(int n1,int n2) 被调用");
		return n1 + n2;
	}
	//一个整数和一个double
	public double calculate(int n1,double n2){
		return n1 + n2;
	}
	//一个double和一个int
	public double calculate(double n1,int n2){
		return n1 + n2;
	}
	//三个int
	public double calculate(int n1 , int n2 , int n3) {
		return n1 + n2 + n3;
	}
	
	
	
}