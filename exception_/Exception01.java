package com.hspedu.exception_;

public class Exception01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		//1 num1/num2 => 10/0
		//2 儅執行到 num1 / num2 因爲 num2 = 0,程序就會抛出異常 ArithmeticException
		//3 儅異常抛出后,程序就退出了,崩潰了,下面的代碼就不在執行\
		//4 這樣的程序合理嗎? 不好,不應該出現了一個不算致命的問題,就導致系統崩潰
		//5 java設計者,提供了一個叫 做異常處理機制 來解決問題
//		int res = num1 / num2;
		// 如果程序猿覺得一段代碼可能出現異常/問題,可以使用try-catch異常處理機制來解決
		//從而保證程序的健壯性
		//將該代碼塊->選中->快捷鍵ctrl+alt+t->選中try-catch
		//6 如果進行異常處理,那麽即使出現了異常,程序可以繼續執行
		try {
			int res = num1 / num2;
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("出現異常的原因" + e.getMessage());
		}
		
		System.out.println("程序繼續運行" );
	}
}
