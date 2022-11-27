public class HomeWork018405{
	public static void main(String[] args) {
		int [] arr = new int[10];
		for(int i = 0;i < arr.length;i++) {
			arr[i] =(int)(Math.random()*100) + 1;//生產隨機數1-100
		}
		double sum = 0;
		int max = 0;
		int indexMax = 0;
		int findNum = 8;
		int findx = -1;
		for(int i = (arr.length - 1); i >= 0 ;i--) {
			System.out.print(arr[i] + "\t");
		}
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
			if(arr[i] > max) {
				max = arr[i];
				indexMax = i;
			}
			if(arr[i] == findNum) {
				findx++;
			}
		}
		if(findx >= 0) {
			System.out.println("裏面有8");
		}else {
			System.out.println("裏面沒有8");
		}
		System.out.println("平均值="+ sum/arr.length);
		System.out.println("最大值="+ max + "下標=" + indexMax);
	}
}