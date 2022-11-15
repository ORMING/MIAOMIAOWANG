public class Stars{
	public static void main(String[] args) {
		int totalLevel = 9;//層數
		for(int i = 1; i <= totalLevel; i++) {
			//在輸出*之前的空格
			for(int k = 1; k <= totalLevel - i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i - 1 ; j++) {//輸出星星
				if(j == 1 || j== 2*i -1 ||i == totalLevel) {控制空格和星星輸出
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");//換行
		}
	}
}