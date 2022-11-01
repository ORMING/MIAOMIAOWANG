public class LogicLoperator01{
	public static void main(String[] args) {
		//&&短路與
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}
		//&邏輯與使用
		if(age > 20 & age < 90) {
			System.out.println("ok200");
		}
		//區別
		int a =4;
		int b =9;
		//對於&&短路與而言，如果第一個條件為f，後面條件不在判斷
		//對於&邏輯與而言，如果第一個條件為f，後面條件依舊會判斷
		if(a < 1 & ++b < 50) {//&&a<1不滿足後面語句不運行
			System.out.println("ok300");
		}
		System.out.println("a=" + a + "b=" + b);//&4 10  &&4 9
	}
}