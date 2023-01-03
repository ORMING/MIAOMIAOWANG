public class recusionExercise01{
	public static void main(String[] args) {
		T1 t1 = new T1();
//		int n = 7;
//		int res = t1.fibonacci(n);
//		System.out.println("当n="+ n +"对应的斐波那契数=" + res);
		int day = 5;
		int peachNum = t1.peach(day);
		if(peachNum != -1) {
			System.out.println("第"+day+"天有"+peachNum+"个桃子");
		}
	}
}
class T1{
//	使用递归方式求出斐波那契数1，1，2，3，5，8，13····给你一个整数n，求出它的值是多少
//	思路分析
//	1.当n=1斐波那契数 是1
//	2.当n=2斐波那契数 是1
//	3.当n>=3 斐波那契数 是前两个数的和
//	4.这里就是一个递归的思路
	public int fibonacci(int n) {
		if(n >= 1) {
			
			if(n == 1||n == 2) {
				return 1;
			}else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		}else {
			System.out.println("要求输入n>=1的整数");
			return -1;
		}
	}
	/*
	 * 猴子吃桃子问题
	 *思路分析
	 *1.day = 10 时 有 1个桃子
	 *2.day = 9 时 有 (day10 + 1)*2 = 4
	 *3.day = 8 时 有 (day9 + 1)*2 = 10
	 *4.规律就是 前一天桃子 = （后一天桃子 + 1）* 2
	 *5.递归
	 */
	public int peach(int day) {
		if(day == 10) {
			return 1;
		}else if(day >= 1 && day <= 9) {
			return(peach(day + 1) + 1)*2;
		}else {
			System.out.println("day在1-10");
			return-1;
			
		}
	}
}