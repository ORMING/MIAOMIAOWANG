public class MethodExercise01{
	public static void main(String[] args) {
		AA01 a = new AA01();
		if(a.isOdd(1)) {//t,這種寫法很常用
			System.out.println("是奇數");
			
		}else {
			System.out.println("是偶數");
		}
		
		a.print(40, 30, '!');
		
	}
}
class AA01{
	public boolean isOdd(int num) {
//		if(num % 2 != 0) {
//			return true;
//		}else {
//			return false;
//		}
//		return num % 2 != 0 ? true;false;
		return num % 2 != 0;
	}
	public void print(int row,int col,char c) {
		for(int i =0 ; i< row ; i++) {
			for(int j = 0 ;j <col; j++) {//輸出每一行
				System.out.print(c);
			}
			System.out.println();
		}
	}
}