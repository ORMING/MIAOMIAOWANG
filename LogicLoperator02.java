public class LogicLoperator02{
	public static void main(String[] args) {
		//||短路或
			int age = 50;
			if(age > 20 || age < 30) {
					System.out.println("ok100");
			}
			//|邏輯或
			if(age > 20 | age < 30) {
				System.out.println("ok200");
			}	
			//||規則：兩個條件中只要一個成立結果為t，否則為f（第一個條件達成直接輸出不判斷後面條件）效率高 常用
			//| 規則：兩個條件中只要一個成立結果為t，否則為f（第一個條件達成依舊要完全運行）效率低
			int a = 4;
			int b = 9;
			if( a > 1 || ++b > 4) {
				System.out.println("ok300");
			}
			System.out.println("a=" + a + "b=" + b);//|4 10  ||4 9
			}
			
	
}