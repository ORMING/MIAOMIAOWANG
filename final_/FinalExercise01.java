package chapter10.com.hspedu.final_;

public class FinalExercise01 {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println(circle.calArea());
		
		
	}
}
class Circle{
	private double radius;
	private final double PI = 3.14;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
//		PI = 3.14;
	}
	{
//		PI = 3.14;
	}

	public double calArea() {
		return PI * radius * radius;
	}
}