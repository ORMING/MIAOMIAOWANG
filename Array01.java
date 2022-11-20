public class Array01{
	public static void main(String[] args) {
	double[] hens = {3, 5, 1, 3.4, 2 ,50};
	//遍歷數組的所有元素的和，使用for
	//1我們可以通過hens[下標]來訪問數組的元素
	//下標從0開始 0，1，2，3，
	//2通過for就可以循環訪問 數組的元素/值
	//可以通過 數組名.length得到數組的大小和長度
	System.out.println("數組的長度" + hens.length);
	double totalWeight = 0;
	for(int i = 0; i < hens.length; i++) {
		totalWeight += hens[i];
		
	}
	System.out.println("總體重=" + totalWeight + "平均體重=" + totalWeight/hens.length);
	}
}