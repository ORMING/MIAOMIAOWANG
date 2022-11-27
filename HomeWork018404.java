public class HomeWork018404{
	public static void main(String[] args) {
		int [] arr = {10,12,45,90};
		//先擴容
//		int [] arr2 = new int[arr.length + 1];
//		for(int i = 0; i < arr.length;i++) {
//			arr2[i] = arr[i];
//		}
//		//導入數據
//		arr2[arr2.length - 1] = 23;
//		arr = arr2;
//		//輸出測試
//		for(int i = 0; i < arr.length;i++) {
//			System.out.print(arr[i] + "\t");
//		}
//		System.out.println();
//		//冒泡排序
//		int temp = 0;
//		for(int i = 0;i < (arr.length - 1);i++) {	
//			for(int j = 0; j < (arr.length - 1 - i) ;j++) {
//				if(arr[j] > arr[j+1]) {
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		int insertNum = 34;
		int index = -1;
		for(int i = 0; i < arr.length;i++) {//尋找插入位置
			if(insertNum <= arr[i]) {
				index = i;
				break;
			}
		}
		if(index == -1) {//數組中間不滿足的情況
			index = arr.length;
		}
		//擴容
		int [] arr2 = new int[arr.length + 1];
		//添加
		for(int i = 0,j = 0;i < arr2.length;i++) {
			if(i != index) {//説明可以把arr拷貝到arrNew
				arr2[i] = arr[j];
				j++;//i 和 j 不同步自增剛好跳過插入的空
			}else {//這個位置就是插入位置
				arr2[i] = insertNum;
			}
		}
		arr = arr2;
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}