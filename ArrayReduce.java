import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		do {
			int[] arrNew = new int[arr.length - 1];
			for(int i = 0; i < arr.length - 1 ; i ++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
			for(int i = 0 ; i < arr.length ; i ++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			if(arr.length == 1) {
				System.out.println("不能再縮減");
				break;
			}
			System.out.println("是否繼續縮減y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n') {
				break;
			}
		}while(true);
	}
}