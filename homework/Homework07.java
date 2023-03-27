package chapter11.hspedu.homework;

public class Homework07 {
	public static void main(String[] args) {
		//實例化不同的car對象
		Car2 car = new Car2(34);
		car.getAir().flow();
		Car2 car1 = new Car2(-3);
		car1.getAir().flow();
		Car2 car2 = new Car2(545);
		car2.getAir().flow();
	}
}

class Car2{
	private double temperature;
	public Car2(double temperature) {
		super();
		this.temperature = temperature;
	}
	//Air 成員内部類
	class Air{
		public void flow() {
			if(temperature > 40) {
				System.out.println("溫度大於40 空調吹冷氣");
			}else if(temperature < 0) {
				System.out.println("溫度小於0 空調吹暖氣");
			}else {
				System.out.println("空調關閉");
			}
			
			
		}
		
	}
	public Air getAir() {
		return new Air();
	}
}