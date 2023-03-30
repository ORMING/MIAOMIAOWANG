package com.hspedu.try_;

public class TryCatchDetail {
	public static void main(String[] args) {
		//Shift+Alt+Z
		//1 如果異常發生了,則異常發生後面的代碼不會執行,直接進入到catch快
		//2 如果異常沒有發生,則順序執行try的代碼塊,不會進入到catch
		//3 如果希望不管是否發生異常,都執行某段代碼(比如關閉鏈接,釋放資源等)則使用如下代碼- finally
		try {
			String str = "123";
			int a = Integer.parseInt(str);
			System.out.println("數字:" + a);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println("異常信息=" + e.getMessage());
		}finally {
			System.out.println("無論如何都會運行的部分finally");
		}
	}
}
