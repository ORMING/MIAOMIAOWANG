public class MethodDetail{
	public static void main(String[] args) {
		AA a = new AA();
		int [] res = a.grtSumAndSub(1, 4);
		System.out.println("和"+res[0]);
		System.out.println("差"+res[1]);
		
		//細節：調用參數的方法時，一定對應著參數列表傳入相同的或者兼容的類型的參數
		byte b1 = 1;
		byte b2 = 2;
		a.grtSumAndSub(b1,b2);//byte -> int
		//a.grtSumAndSub(1.1,1.8);double -> int(x)
		//實參和形參的或者兼容，個數，順序必須一致
		//a.grtSumAndSub(100);x個數不一樣
	}
}
class AA{
	//1一個方法最多有一個返回值【需要多個返回值可以使用數組】
	public int[] grtSumAndSub(int n1,int n2){
		int[]resArr = new int[2];//創建一個數組
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
//	2返回類型可以是任何類型，包括基本類型或者引用類型（數組，對象）
//	3如果有返回類型，則方法躰中最後的執行語句必須爲return值；
	//而且要求返回值和return的值類型一致或者兼容
	public int f1() {
		double d1 = 1.1*3;
		int n = 100;
		return n;
	}
	//4如果方法是void，則方法體中可以沒有return語句，或者只寫return
	//實際工作中，方法都是爲了完成某個功能，所以方法名字一般都有意義
	public void f2() {
		System.out.println("喵喵");
		return;
	}
}