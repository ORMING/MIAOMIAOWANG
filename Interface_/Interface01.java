package chapter10.com.hspedu.Interface_;

public class Interface01 {
	public static void main(String[] args) {
		//创建手机 相机对象
		Camera camera = new Camera();
		Phone phone = new Phone();
		//创建计算机
		Compuer compuer = new Compuer();
		compuer.work(phone);//把手机接入到计算机
		System.out.println("===========");
		compuer.work(camera);//把相机接入到计算机
	}
}
