package chapter11.hspedu.homework;

public class homework06 {
	public static void main(String[] args) {
		Person tang = new Person("唐僧", new Horse());
		tang.commmon();//一般情况
		tang.passRiver();//过河
		tang.passFirehill();//过火焰山
	}
}
interface Vehicles{
	public void work();
}
class Horse implements Vehicles{

	@Override
	public void work() {
		// TODO 自动生成的方法存根
		System.out.println("一般情况使用马儿");
	}
	
}
class Boat implements Vehicles{

	@Override
	public void work() {
		// TODO 自动生成的方法存根
		System.out.println("过河的时候使用小船");;
	}
	
}
class Plane implements Vehicles{

	@Override
	public void work() {
		// TODO 自动生成的方法存根
		System.out.println("过火焰山使用飞机");
	}
	
}
class VehiclesFactory {
	//马儿始终是同一匹
	//创建交通工具厂类,分别获得交通工具Horse 和 Boat
	//这里,将方法做成static比较方便
	private static Horse horse = new Horse();//饿汉式
	
	private VehiclesFactory() {}
	public static Boat getBoat() {
		return new Boat();
	}
	public static Horse getHorse() {
		return horse;
	}
	public static Plane getPlane() {
		return new Plane();
	}
}
class Person{
	private String name ;
	private Vehicles vehicles;
	//在创建人对象时,事先给他分配一个交通工具
	public Person(String name, Vehicles vehicles) {
		super();
		this.name = name;
		this.vehicles = vehicles;
	}
	//实例化Person对象"唐僧",要求一般情况下用Horse作为交通工具,遇到大河时用Boat作为交通工具
	//这里涉及到一个编程思路,就是可以把具体的要求,封装成方法
	public void passRiver() {
		//先得到船
		//判断一下当前 Vehicles 属性是null,就获取一艘船
//		Boat boat = VehiclesFactory.getBoat();
//		boat.work();
		//如何放在始终使用的是传入的马对象 instanceOf
		//vehicles instanceof Boat 判断当前的vehicles是不是船
		//1 vehicles 为null -> f
		//2 vehicles 为马对象 -> f
		//3 vehicles 为船对象 -> t
		if(!(vehicles instanceof Boat)) {
			vehicles = VehiclesFactory.getBoat();
		}
		vehicles.work();
	}
	public void commmon() {
		//得到马儿
		//判断一下当前 Vehicles 属性是null,就获取一匹马
		if(!(vehicles instanceof Horse)) {
			//这里使用的是多态
			vehicles = VehiclesFactory.getHorse();
			
		}
		//这里体现使用接口调用
		vehicles.work();
	}
	//过火焰山
	public void passFirehill() {
		if(!(vehicles instanceof Plane)) {
			//这里使用的是多态
			vehicles = VehiclesFactory.getPlane();
		}
		vehicles.work();
	}
}
