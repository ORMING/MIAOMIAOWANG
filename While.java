public class While{
	public static void main(String[] args) {
		int i = 1;//循環變量初始化
		while(i <= 10) {//循環條件
			System.out.println("holle" + i);//執行語句
			i++;//循環變量迭代
		}
		System.out.println("退出while"+ "\r"+"i="+ i);
	}
}