public class AutoConvert{
	public static void main(String[] args) {
		//演示自動轉換
		int num = 'a';// ok char 到 int
		double d1 = 80;//ok int 到 double
		System.out.println(num);//97
		System.out.println(d1);//80.0
		//  多種類型數據混合運算時
		//系統會先自動把數據轉換成容量最大的那種再進行運算
		int n1 = 10;//
		//float d2 =n1 + 1.1;錯誤n1+1.1結果類型為double
		//double d2 = n1 + 1.1; 解決1結果類型為double
		float d2 = n1 + 1.1f;//解決2 n1+1.1結果類型為float
		System.out.println(d2);
		//   精度大的可以轉換成精度小的會報錯
		//反之就會自動轉換
		//int n2 = 1.1; //double 不能轉換到 int
		//(byte,short)和char之間不會相互自動轉化
		byte b1 = 10;//-128~127//檔把數附給byte時，先判斷數是否在byte範圍内，如果是就可以
		/*
		 * int n2 = 1;//n2 是int byte b2 = n2;//錯誤 如果變量賦值，首先判斷類型
		 */		
		//char c1 = b1; //錯誤，byte不能自動轉換成char
		
		
		//  byte short char 他們三者可以計算，在計算時首先轉換成int類型
		byte b2 = 1;
		short s1 =1;
		//short s2 = b2 + s1 ;//錯誤 b2 + s1 => int
		int s2 = b2 + s1;//對 b2 + s1 =>int
		//byte b4 = b2 + b3 //錯誤 b2 + b3 => int
		//boolean不參與轉換
		boolean pass = true;
		//int num100 = pass;//錯誤 boolean 不參與類型的自動轉換
		//自動提升原則：表達式結果類型自動提升爲 操作數中最大類型
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 =1.1;
		double num500 = b4 + s3 + num200 + num300;//需要其中最大的類型接收
		System.out.println(num500);
		
	}
}