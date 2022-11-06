public class IFExercise01 {
	public static void main(String[] args) {
		//編寫程序，聲明2個double型變量並賦值
		//判斷第一個數大於10.0，且第二個數小於20.0，打印兩數之和
		double d1 = 34.5;
		double d2 = 2.6;
		if(d1>10.0 && d2<20.0) {
			System.out.println("兩數之和=" + (d1 + d2));
		}
	int num1 = 23;
	int num2 = 43;
	int sum = num1 + num2;
	if(sum % 3 == 0 && sum % 5 == 0) {
		System.out.println("可以被整除");
		}else{
		System.out.println("不可以被整除");
		}
	int year = 2000;
	if((year % 4 == 0 && year % 100 !=0) | year % 400 ==0) {
		System.out.println( year +"是閏年");
	    }else {
		System.out.println( year + "不是潤年");
	    }
	
	
	}
}