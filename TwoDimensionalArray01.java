public class TwoDimensionalArray01{
	public static void main(String[] args) {
		int[][] arr = {{0,0,0,0,0,0,},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0,}};//二維數組 構成一個數組的元素也是一個數組 定義為兩個括號
		System.out.println("二維數組的元素個數=" + arr.length);
		System.out.println("第3個數組的第2個值" + arr[3][2]);
		for(int i = 0;i < arr.length; i++) {//遍歷二維數組的每個元素(一個元素就是一個數組)
			System.out.println("二維數組的元素個數=" + arr[i].length);
			//arr[i]表示外層的數組
			//arr[i].length得到對應的每一個内部數組的長度
			for(int j = 0; j < arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}