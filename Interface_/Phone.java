package chapter10.com.hspedu.Interface_;
//Phone 类 实现 UsbInterface
//解读1. 即Phone类需要实现 UsbInterface接口 规定/声明方式
public class Phone implements UsbInterface{
	@Override
	public void star() {
		// TODO 自动生成的方法存根
		System.out.println("手机开始工作");
		
	}
	@Override
	public void stop() {
		// TODO 自动生成的方法存根
		System.out.println("手机停止工作");
	}
}
