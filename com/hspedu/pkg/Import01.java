package com.hspedu.pkg;

import java.util.Arrays;

//一般最好使用到哪个类导入哪个类，不建议*导入
//import java.util.Scanner;//表示只会引入java.util包下面的Scanner
//import java.util.*;//表示导入java.util包下所有类
public class Import01 {
	public static void main(String[] args) {
		//使用系统提供的Arrays完成数组排序
		int[] arr = {-1,20,2,13,3};
		//比如对其进行排序
		//传统方法是直接编写排序（冒泡）
		//提供是提供了相关的类可以方便完成，比如Arrays
		Arrays.sort(arr);
		//输出排序结果
		for(int i = 0;i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

}
