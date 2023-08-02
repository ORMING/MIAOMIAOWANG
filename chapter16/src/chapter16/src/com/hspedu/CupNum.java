package chapter16.src.com.hspedu;

public class CupNum {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		//獲取當前電腦的cpu數量
		int cpuNums = runtime.availableProcessors();
		System.out.println("當前電腦的cpu數量"+ cpuNums);
	}
}	
