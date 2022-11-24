public class BubbleSort{
	public static void main(String[] args) {
		int[] arr = {24,69,80,57,13};
		int temp = 0;//中間變量
		for(int j = arr.length; j > 0  ; j--)	{//外層循環排序用
			for(int i = 0; i < ( arr.length -1); i++) {//内層循環比較用
//		for(int j = 0; j < arr.length  ; j++)	{//外層循環排序用
//			for(int i = 0; i < ( arr.length -1 - j); i++) {//内層循環比較用
				if(arr[i] > arr[i+1]) {//比較后交換
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				for(int z = 0;z < 5;z++) {//檢查用
						System.out.print(arr[z]+ "\t");
					}
					System.out.println();
			}
		}
		for(int i = 0;i < arr.length;i++) {//最終結果
			System.out.println(arr[i]);
		}
	}
}