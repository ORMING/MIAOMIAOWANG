public class FloatDetait{
	public static void main(String[] arge) {
		//错误float num1 =1.1;
		float num2 = 1.1f;
		double num3 = 1.1;//浮点默认double
		double num4 = 1.1f;
		double num5 = .123;//等价0.123
		System.out.println(num5);
		//科学计数法形式：如：5.12e2 [5.12*10的二次方]  5.12e-2[5.12/10的二次方]
		System.out.println(5.12e2);
		System.out.println(5.12e-2);
		double num9 = 2.123456789;
		float num10 = 2.123456789f;//F必须标注
		System.out.println(num9);
		System.out.println(num10);
		//陷阱2.7和8.1/3比较
		double num11 = 2.7;
		double num12 = 8.1/3;//2.7
		System.out.println(num11);
		System.out.println(num12);//接近2.7的一个小数而不是2.7
		//得到一个重要的使用点：当我们对运算结果是小数的进行相等判断是，要小心
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		if(num11 == num12) {
			System.out.println("相等");
		}
		//多行注释快捷键ctrl+/
		//正确的比较
		if(Math.abs(num11-num12)<0.001) {
			System.out.println("差值很小认为相等");
		}//
		System.out.println(Math.abs(num11 - num12));
		
	}
}