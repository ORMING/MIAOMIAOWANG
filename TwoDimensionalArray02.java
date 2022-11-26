public class TwoDimensionalArray02{
	public static void main(String[] args) {
//		初始化方法
//		語法類型[][]數組名=new類型[大小][大小]
//		比如int a[][] = new int[2][3]		
//	
		int arr[][];
		arr = new int[2]3];
		arr[1][1] = 8;
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}