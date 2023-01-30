public class Homework0260{
	public static void main(String[] args) {
		Circle02 c = new Circle02();
		PassObject po = new PassObject();
		po.printAreas(c,5);
		
	}
}
class Circle02{
	double radius;
	public Circle02() {
		
	}
	public Circle02(double radius) {
		this.radius = radius;
		
	}
	public double findArea() {
		return Math.PI*radius *radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
class PassObject{
	public void printAreas(Circle02 c,int times) {
		System.out.println("radius\tarea");
		for(int i = 1; i <= times; i++) {
			c.setRadius(i);
			System.out.println(i+ "\t" + c.findArea());
		}
	}
}