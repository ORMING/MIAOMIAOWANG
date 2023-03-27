package chapter11.hspedu.homework;

public class homework04 {
	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		/*1 匿名内部类是谁
		 * new ICalculate() {
			@Override
			public double work(double n1, double n2) {
				// TODO 自动生成的方法存根
				return n1 + n2;
			}
		}, 同时也一个对象
		
		 */
		cellphone.testwork(new ICalculate() {
			
			@Override
			public double work(double n1, double n2) {
				// TODO 自动生成的方法存根
				return n1 + n2;
			}
		}, 10, 8);
		cellphone.testwork(new ICalculate() {
			
			@Override
			public double work(double n1, double n2) {
				// TODO 自动生成的方法存根
				return n1 * n2;
			}
		}, 34, 23);
	}
}
//编写接口
interface ICalculate{
	//work方法是完成运算,但是没有具体要求,所以要求自己设计
	//至于该方法完成怎样的计算,我们交给匿名内部类完成
	public double work (double n1 , double n2);
}
class Cellphone{
	//当我们调用testWork方法时,理解传入一个实现了ICalculate接口的匿名内部类即可
	//该匿名内部类,可以灵活的实现work,完成不同的计算任务
	public void testwork (ICalculate iCalculate , double n1 , double n2) {
		// TODO 自动生成的方法存根
		double result = iCalculate.work(n1, n2);//动态绑定
		System.out.println("计算后的结果是=" + result);
	}
}