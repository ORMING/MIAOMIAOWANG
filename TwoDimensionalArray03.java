public class TwoDimensionalArray03{
	public static void main(String[] args) {
		int[][] arr = new int[3][];//列數不確定的時候可以不寫（1位數組沒有空間）
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];//new給數組開空間 如果不開數組就是null
//			遍歷數組並賦值
			for(int j = 0;j < arr[i].length;j++) {
				arr[i][j] = i + 1;
			}
		}
		//遍歷輸出
		System.out.println(=======arr元素==========);
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}