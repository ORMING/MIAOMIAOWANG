public class OverLoadExercise{
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(10);
		method.m(10,20);
		method.m("喵");
		
		System.out.println(method.max(10,20));
		System.out.println(method.max(10.0,20.43));
		System.out.println(method.max(10.3,20.5,43));
	}
}
class Methods{
	public int max(int n1,int n2) {
		return n1 > n2 ? n1 : n2;
		
	}
	
	public double max(double n1,double n2) {
		return n1 > n2 ? n1 : n2;
		
	}
	
	public double max(double n1,double n2,double n3) {
		double max1 = n1 > n2? n1:n2;
		return max1 > n3 ? max1 : n3;
		
	}
	
	
	public void m(int n1) {
		System.out.println(n1*n1);
	}
	public void m(int n1,int n2) {
		System.out.println(n1*n2);
	}
	public void m(String c) {
		System.out.println( c);
	}
	
}