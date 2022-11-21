public class ArrayAssign{
	public static void main(String[] args) {
		//基本數據類型賦值，賦值方式為拷貝
		//n2變化不會印象到n1
		int n1 = 10;
		int n2 = n1;
		
		n2 = 80;
		System.out.println(n1);
		System.out.println(n2);
		
		//數組在默認情況下是引用傳遞，賦的是地址賦值方式為引用傳達
		//是一個地址，arr2變化會印象到arr1
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;//把arr1賦給arr2
		arr2[0] = 10;
		//arr1的值
		for(int i = 0;i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	}
}