public class ArithmeticOperatorExercise01{
	public static void main(String[] args) {
		int i = 1;//i->1
		i = i++;//規則使用臨時變量：（1）temp=i；（2）i=i+1；（3）i=temp；
		System.out.println(i);//1
		
		int j = 1;
		j = ++j;//規則使用臨時變量：（1）j=j+1;(2)temp=j(3)j=temp;
		System.out.println(j);//2
		
		int i1 =10;
		int i2 =20;
		int k = i1++;
		System.out.println("k="+k);
		System.out.println("i1="+i1 );
		k = --i2;
		System.out.println("k="+k);;
		System.out.println("i2="+i2);
		
		int days = 59;
		int weeks = days/7;
		int leftDays = days % 7;
		System.out.println(days + "天 合" + weeks + "星期零");
		
		double huaShi = 234.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println(sheShi);
	}
}