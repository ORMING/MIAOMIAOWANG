public class Method01{
	public static void main(String[] args) {
		//方法使用
		//1 方法寫好后，不調用是不會有輸出
		//2 先創建后再調用方法即可
		Person01 p1 = new Person01();
		p1.speak();//調用方法
		p1.cal01();//調用cal01
		p1.cal02(5);//調用cal02，並讓n=5
		p1.cal02(10);//調用cal02，並讓n=10
		int returnRes = p1.getSum(10,20);//調用getSum，同時num1=10，num2=20//把return返回的值賦給returnRes
		System.out.println("return返回的值賦給=" + returnRes);
	}
}
class Person01{
	String name;
	int age;
	//方法（成員方法）
	//添加speak 成員方法輸出“我是一隻好人”
	//1 public 表示為公開
	//2 void 表示沒有返回值
	//3 speak（） speak是方法名，（）形參列表
	//4 {}方法躰，可以是我們要執行的代碼
	//5 System.out.println("我是一隻好人"); 表示這個方法是輸出一段話
	public void speak() {
		System.out.println("我是一隻好人");
	}
	//添加cal01；計算1到100的和
	public void cal01() {
		int res = 0;
		for(int i = 0;i <= 100 ; i++) {
			res += i;
		}
		System.out.println(res);
	}
	//添加cal02；接受一個n，計算從1+到n的結果
	//1 int n 是形參列表，表示當前有一個n接受用戶輸入
	public void cal02(int n){
		int res = 0;
		for(int i = 0;i <= n ; i++) {
			res += i;
		}
		System.out.println("cal02結果"+res);
	}
	//添加getSum方法 ，計算兩個數的和
	//public 表示公開
	//int 表示運行后是一個int值
	//getsum方法名
	//(int num1,int num2)表示兩形參可以輸入兩個數字
	//return res 表示返回res的值
	public int getSum(int num1,int num2){
		int res =num1 +num2;
		return res;
	}
}