package chapter10.com.hspedu.Interface_;

public class Compuer {
	//编写一个方法
	public void work(UsbInterface usbInterface) {
		//通过接口来调用方法
		usbInterface.star();
		usbInterface.stop();
	}
}
